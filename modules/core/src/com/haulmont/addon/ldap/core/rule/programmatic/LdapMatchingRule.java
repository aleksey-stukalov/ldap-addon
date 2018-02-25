package com.haulmont.addon.ldap.core.rule.programmatic;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface LdapMatchingRule {

    String uuid() ;
    String description();
}
