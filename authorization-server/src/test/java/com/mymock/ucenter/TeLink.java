package com.mymock.ucenter;

public class TeLink {
    
    private String href;
    
    private boolean templated;
    
    public TeLink(){}
    
    public TeLink(String href, boolean templated) {
        this.href = href;
        this.templated = templated;
    }

    public boolean isTemplated() {
        return templated;
    }

    public void setTemplated(boolean templated) {
        this.templated = templated;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
    
    public String getHrefNoVar() {
        if (isTemplated()) {
            int i = getHref().indexOf('{');
            return getHref().substring(0, i);
        } else {
            return getHref();
        }
    }
    
    public static void main(String...args) {
        TeLink tl = new TeLink("http://www.abc{?page,}", true);
        String s = tl.getHrefNoVar();
        System.out.println(s);
    }
}
