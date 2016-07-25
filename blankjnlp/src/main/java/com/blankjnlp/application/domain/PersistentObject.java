package com.blankjnlp.application.domain;

import java.io.Serializable;

public abstract class PersistentObject<T extends Serializable> {

    public abstract T getKey();

}
