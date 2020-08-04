package com.java;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link AbstractSomeClass}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code new SomeClass.Builder()}.
 */
@Generated(from = "AbstractSomeClass", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
public final class SomeClass extends AbstractSomeClass {
  private final int foo;
  private final String bar;
  private final List<Integer> buz;

  private SomeClass(int foo, String bar, List<Integer> buz) {
    this.foo = foo;
    this.bar = bar;
    this.buz = buz;
  }

  /**
   * @return The value of the {@code foo} attribute
   */
  @JsonProperty("foo")
  @Override
  public int foo() {
    return foo;
  }

  /**
   * @return The value of the {@code bar} attribute
   */
  @JsonProperty("bar")
  @Override
  public String bar() {
    return bar;
  }

  /**
   * @return The value of the {@code buz} attribute
   */
  @JsonProperty("buz")
  @Override
  public List<Integer> buz() {
    return buz;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AbstractSomeClass#foo() foo} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for foo
   * @return A modified copy of the {@code this} object
   */
  public final SomeClass withFoo(int value) {
    if (this.foo == value) return this;
    return new SomeClass(value, this.bar, this.buz);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AbstractSomeClass#bar() bar} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bar
   * @return A modified copy of the {@code this} object
   */
  public final SomeClass withBar(String value) {
    String newValue = Objects.requireNonNull(value, "bar");
    if (this.bar.equals(newValue)) return this;
    return new SomeClass(this.foo, newValue, this.buz);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AbstractSomeClass#buz() buz}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final SomeClass withBuz(int... elements) {
    ArrayList<Integer> wrappedList = new ArrayList<>(elements.length);
    for (int element : elements) {
      wrappedList.add(element);
    }
    List<Integer> newValue = createUnmodifiableList(false, wrappedList);
    return new SomeClass(this.foo, this.bar, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AbstractSomeClass#buz() buz}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of buz elements to set
   * @return A modified copy of {@code this} object
   */
  public final SomeClass withBuz(Iterable<Integer> elements) {
    if (this.buz == elements) return this;
    List<Integer> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new SomeClass(this.foo, this.bar, newValue);
  }

  /**
   * This instance is equal to all instances of {@code SomeClass} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof SomeClass
        && equalTo((SomeClass) another);
  }

  private boolean equalTo(SomeClass another) {
    return foo == another.foo
        && bar.equals(another.bar)
        && buz.equals(another.buz);
  }

  /**
   * Computes a hash code from attributes: {@code foo}, {@code bar}, {@code buz}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + foo;
    h += (h << 5) + bar.hashCode();
    h += (h << 5) + buz.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SomeClass} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "SomeClass{"
        + "foo=" + foo
        + ", bar=" + bar
        + ", buz=" + buz
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "AbstractSomeClass", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json extends AbstractSomeClass {
    int foo;
    boolean fooIsSet;
    String bar;
    List<Integer> buz = Collections.emptyList();
    @JsonProperty("foo")
    public void setFoo(int foo) {
      this.foo = foo;
      this.fooIsSet = true;
    }
    @JsonProperty("bar")
    public void setBar(String bar) {
      this.bar = bar;
    }
    @JsonProperty("buz")
    public void setBuz(List<Integer> buz) {
      this.buz = buz;
    }
    @Override
    public int foo() { throw new UnsupportedOperationException(); }
    @Override
    public String bar() { throw new UnsupportedOperationException(); }
    @Override
    public List<Integer> buz() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static SomeClass fromJson(Json json) {
    SomeClass.Builder builder = new SomeClass.Builder();
    if (json.fooIsSet) {
      builder.setFoo(json.foo);
    }
    if (json.bar != null) {
      builder.setBar(json.bar);
    }
    if (json.buz != null) {
      builder.addAllBuz(json.buz);
    }
    return builder.create();
  }

  /**
   * Creates an immutable copy of a {@link AbstractSomeClass} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SomeClass instance
   */
  public static SomeClass copyOf(AbstractSomeClass instance) {
    if (instance instanceof SomeClass) {
      return (SomeClass) instance;
    }
    return new SomeClass.Builder()
        .from(instance)
        .create();
  }

  /**
   * Builds instances of type {@link SomeClass SomeClass}.
   * Initialize attributes and then invoke the {@link #create()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AbstractSomeClass", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_FOO = 0x1L;
    private static final long INIT_BIT_BAR = 0x2L;
    private long initBits = 0x3L;

    private int foo;
    private String bar;
    private List<Integer> buz = new ArrayList<Integer>();

    /**
     * Creates a builder for {@link SomeClass SomeClass} instances.
     * <pre>
     * new SomeClass.Builder()
     *    .setFoo(int) // required {@link AbstractSomeClass#foo() foo}
     *    .setBar(String) // required {@link AbstractSomeClass#bar() bar}
     *    .addBuz|addAllBuz(int) // {@link AbstractSomeClass#buz() buz} elements
     *    .create();
     * </pre>
     */
    public Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AbstractSomeClass} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AbstractSomeClass instance) {
      Objects.requireNonNull(instance, "instance");
      setFoo(instance.foo());
      setBar(instance.bar());
      addAllBuz(instance.buz());
      return this;
    }

    /**
     * Initializes the value for the {@link AbstractSomeClass#foo() foo} attribute.
     * @param foo The value for foo 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("foo")
    public final Builder setFoo(int foo) {
      this.foo = foo;
      initBits &= ~INIT_BIT_FOO;
      return this;
    }

    /**
     * Initializes the value for the {@link AbstractSomeClass#bar() bar} attribute.
     * @param bar The value for bar 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("bar")
    public final Builder setBar(String bar) {
      this.bar = Objects.requireNonNull(bar, "bar");
      initBits &= ~INIT_BIT_BAR;
      return this;
    }

    /**
     * Adds one element to {@link AbstractSomeClass#buz() buz} list.
     * @param element A buz element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addBuz(int element) {
      this.buz.add(element);
      return this;
    }

    /**
     * Adds elements to {@link AbstractSomeClass#buz() buz} list.
     * @param elements An array of buz elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addBuz(int... elements) {
      for (int element : elements) {
        this.buz.add(element);
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link AbstractSomeClass#buz() buz} list.
     * @param elements An iterable of buz elements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("buz")
    public final Builder setBuz(Iterable<Integer> elements) {
      this.buz.clear();
      return addAllBuz(elements);
    }

    /**
     * Adds elements to {@link AbstractSomeClass#buz() buz} list.
     * @param elements An iterable of buz elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllBuz(Iterable<Integer> elements) {
      for (int element : elements) {
        this.buz.add(Objects.requireNonNull(element, "buz element"));
      }
      return this;
    }

    /**
     * Builds a new {@link SomeClass SomeClass}.
     * @return An immutable instance of SomeClass
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SomeClass create() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new SomeClass(foo, bar, createUnmodifiableList(true, buz));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_FOO) != 0) attributes.add("foo");
      if ((initBits & INIT_BIT_BAR) != 0) attributes.add("bar");
      return "Cannot build SomeClass, some of required attributes are not set " + attributes;
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
