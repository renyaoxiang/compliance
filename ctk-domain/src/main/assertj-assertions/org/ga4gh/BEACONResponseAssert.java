package org.ga4gh;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

/**
 * {@link BEACONResponse} specific assertions - Generated by CustomAssertionGenerator.
 */
public class BEACONResponseAssert extends AbstractAssert<BEACONResponseAssert, BEACONResponse> {

  /**
   * Creates a new <code>{@link BEACONResponseAssert}</code> to make assertions on actual BEACONResponse.
   * @param actual the BEACONResponse we want to make assertions on.
   */
  public BEACONResponseAssert(BEACONResponse actual) {
    super(actual, BEACONResponseAssert.class);
  }

  /**
   * An entry point for BEACONResponseAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myBEACONResponse)</code> and get specific assertion with code completion.
   * @param actual the BEACONResponse we want to make assertions on.
   * @return a new <code>{@link BEACONResponseAssert}</code>
   */
  public static BEACONResponseAssert assertThat(BEACONResponse actual) {
    return new BEACONResponseAssert(actual);
  }

  /**
   * Verifies that the actual BEACONResponse's classSchema is equal to the given one.
   * @param classSchema the given classSchema to compare the actual BEACONResponse's classSchema to.
   * @return this assertion object.
   * @throws AssertionError - if the actual BEACONResponse's classSchema is not equal to the given one.
   */
  public BEACONResponseAssert hasClassSchema(org.apache.avro.Schema classSchema) {
    // check that actual BEACONResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting classSchema of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    org.apache.avro.Schema actualClassSchema = actual.getClassSchema();
    if (!Objects.areEqual(actualClassSchema, classSchema)) {
      failWithMessage(assertjErrorMessage, actual, classSchema, actualClassSchema);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual BEACONResponse's exists is equal to the given one.
   * @param exists the given exists to compare the actual BEACONResponse's exists to.
   * @return this assertion object.
   * @throws AssertionError - if the actual BEACONResponse's exists is not equal to the given one.
   */
  public BEACONResponseAssert hasExists(Boolean exists) {
    // check that actual BEACONResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting exists of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Boolean actualExists = actual.getExists();
    if (!Objects.areEqual(actualExists, exists)) {
      failWithMessage(assertjErrorMessage, actual, exists, actualExists);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual BEACONResponse's frequency is equal to the given one.
   * @param frequency the given frequency to compare the actual BEACONResponse's frequency to.
   * @return this assertion object.
   * @throws AssertionError - if the actual BEACONResponse's frequency is not equal to the given one.
   */
  public BEACONResponseAssert hasFrequency(Long frequency) {
    // check that actual BEACONResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting frequency of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Long actualFrequency = actual.getFrequency();
    if (!Objects.areEqual(actualFrequency, frequency)) {
      failWithMessage(assertjErrorMessage, actual, frequency, actualFrequency);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual BEACONResponse's schema is equal to the given one.
   * @param schema the given schema to compare the actual BEACONResponse's schema to.
   * @return this assertion object.
   * @throws AssertionError - if the actual BEACONResponse's schema is not equal to the given one.
   */
  public BEACONResponseAssert hasSchema(org.apache.avro.Schema schema) {
    // check that actual BEACONResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting schema of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    org.apache.avro.Schema actualSchema = actual.getSchema();
    if (!Objects.areEqual(actualSchema, schema)) {
      failWithMessage(assertjErrorMessage, actual, schema, actualSchema);
    }

    // return the current assertion for method chaining
    return this;
  }



}