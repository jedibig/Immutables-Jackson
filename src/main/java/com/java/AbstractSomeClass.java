package com.java;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;
import org.immutables.value.Value.Style.ImplementationVisibility;

import java.util.List;

@JsonSerialize(as = SomeClass.class)
@JsonDeserialize(as = SomeClass.class)
@Value.Immutable
@Value.Style(
        get = {"is*", "get*"}, // Detect 'get' and 'is' prefixes in accessor methods
        init = "set*", // Builder initialization methods will have 'set' prefix
        typeAbstract = "Abstract*", // 'Abstract' prefix will be detected and trimmed
        typeImmutable = "*", // No prefix or suffix for generated immutable type
        builder = "new", // construct builder using 'new' instead of factory method
        build = "create", // rename 'build' method on builder to 'create'
        visibility = ImplementationVisibility.PUBLIC // Generated class will be always public
)
public abstract class AbstractSomeClass {
    public abstract int foo();
    public abstract String bar();
    public abstract List<Integer> buz();
}
