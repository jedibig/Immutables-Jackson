package com.java;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.List;

@JsonSerialize(as = ImmutableSomeClass.class)
@JsonDeserialize(as = ImmutableSomeClass.class)
@Value.Immutable
public abstract class SomeClass {
    public abstract int foo();
    public abstract String bar();
    public abstract List<Integer> buz();
}
