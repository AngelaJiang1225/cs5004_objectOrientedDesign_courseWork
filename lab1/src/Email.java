public class Email {
    private String loginName;
    private String domain;

    public Email(String loginName, String domain){
        this.loginName = loginName;
        this.domain = domain;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
