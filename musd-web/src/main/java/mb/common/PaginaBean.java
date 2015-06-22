package mb.common;


import javax.faces.application.FacesMessage;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.Serializable;

public class PaginaBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static final String USUARIO_SESSAO = "USUARIO_SESSAO";
	
	/**
     * Adiciona uma nova mensagem do tipo info.
     *
     * @param mensagem
     */
    public void addInfo(String mensagem) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO ,"Informação", mensagem));
    }

    /**
     * Adiciona uma nova mensagem do tipo warn.
     *
     * @param mensagem
     */
    public void addWarn(String mensagem) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Atenção", mensagem));
    }

    /**
     * Adiciona um novo atributo na sessão.
     * 
     * @param chave
     * @param valor
     */
    public void addAtributo(String chave, Object valor) {
        getSession().setAttribute(chave, valor);
    }

    /**
     * Retorna o valor de um atributo da sessão dado uma chave.
     * 
     * @param chave
     * @return valor do tipo Object
     */
    public Object getAtributo(String chave) {
    	if(getSession() != null)
    		return getSession().getAttribute(chave);
    	
    	return null;
    }
    
    /**
     * Remove o valor de um atributo da sessão.
     * 
     * @param chave
     * @return valor do tipo Object
     */
    public Object removerAtributo(String chave) {
    	Object obj = getSession().getAttribute(chave);
    	getSession().removeAttribute(chave);
        return obj;
    }
    
    /**
     * Adiciona uma variável no request.
     * 
     * @param chave
     * @param valor
     */
    public void addRequestParameter(String chave, Object valor) {
    	FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put(chave, valor);
    }

    /**
     * Cria um cookie dado um nome.
     * 
     * @param nome
     * @param valor
     */
    public void addCookie(String nome, String valor) {
        Cookie cookie = new Cookie(nome, valor);
        cookie.setMaxAge(3600);
        getResponse().addCookie(cookie);
    }

    /**
	 * Retorna um cookie dado um nome.
	 *  
	 * @param nome
	 */
    public String getCookie(String nome) {
        Cookie cookies[] = getRequest().getCookies();
        if (cookies != null && cookies.length > 0)
            for (Cookie cookie : cookies)
                if (nome.equals(cookie.getName()))
                    return cookie.getValue();
        return null;
    }

    /**
     * Retorna uma referência do HttpServletResponse.
     * 
     * @return HttpServletResponse
     */
    protected HttpServletResponse getResponse() {
        return (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
    }
    
    /**
     * 
     * @param evt
     */
    public void doForward(String redirect) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        NavigationHandler myNav = facesContext.getApplication().getNavigationHandler();
        myNav.handleNavigation(facesContext, null, redirect);
    }

    /**
     * Retorna uma referência do HttpServletRequest.
     * 
     * @return HttpServletRequest
     */
    protected HttpServletRequest getRequest() {
        return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
    }
    
//    public UsuarioDTO getUsuarioLogado() {
//    	Object obj = getAtributo(USUARIO_SESSAO);
//    	if(obj == null)
//    		return null;
//
//    	return (UsuarioDTO) obj;
//    }
//
//    public void setUsuarioLogado(UsuarioDTO usuario) {
//    	addAtributo(USUARIO_SESSAO, usuario);
//    }
    
    /**
     * Retorna a sessão aberta.
     * 
     * @return HttpSession
     */
    private HttpSession getSession() {
    	Object session = FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    	if(session == null)
    		return null;
    	
        return (HttpSession) session;
    }
}