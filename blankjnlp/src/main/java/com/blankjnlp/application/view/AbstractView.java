package com.blankjnlp.application.view;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;

import com.blankjnlp.application.session.Secao;
import com.blankjnlp.application.view.manager.IAbstractViewManager;

public abstract class AbstractView extends JFrame implements IAbstractViewManager {

    private static final long serialVersionUID = 1L;

    private Secao secao;
    private Map<String, AbstractView> views;
    private ApplicationContext context;

    public AbstractView() {

    }

    @PostConstruct
    public abstract void init();

    protected Secao getSecao() {
        return secao;
    }

    protected Map<String, AbstractView> getViews() {
        return views;
    }

    public ApplicationContext getContext() {
        return context;
    }

    public void setContext(ApplicationContext context) {
        this.context = context;
    }

}
