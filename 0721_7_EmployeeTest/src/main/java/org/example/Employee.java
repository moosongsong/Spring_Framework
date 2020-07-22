package org.example;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public interface Employee {
    int pay();
}
