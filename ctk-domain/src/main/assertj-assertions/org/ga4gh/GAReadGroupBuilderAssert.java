package org.ga4gh;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * {@link GAReadGroup.Builder} specific assertions - Generated by CustomAssertionGenerator.
 */
public class GAReadGroupBuilderAssert extends AbstractAssert<GAReadGroupBuilderAssert, GAReadGroup.Builder> {

  /**
   * Creates a new <code>{@link GAReadGroupBuilderAssert}</code> to make assertions on actual GAReadGroup.Builder.
   * @param actual the GAReadGroup.Builder we want to make assertions on.
   */
  public GAReadGroupBuilderAssert(GAReadGroup.Builder actual) {
    super(actual, GAReadGroupBuilderAssert.class);
  }

  /**
   * An entry point for GAReadGroupBuilderAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myGAReadGroup.Builder)</code> and get specific assertion with code completion.
   * @param actual the GAReadGroup.Builder we want to make assertions on.
   * @return a new <code>{@link GAReadGroupBuilderAssert}</code>
   */
  public static GAReadGroupBuilderAssert assertThat(GAReadGroup.Builder actual) {
    return new GAReadGroupBuilderAssert(actual);
  }

  /**
   * Verifies that the actual GAReadGroup.Builder's created is equal to the given one.
   * @param created the given created to compare the actual GAReadGroup.Builder's created to.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder's created is not equal to the given one.
   */
  public GAReadGroupBuilderAssert hasCreated(Long created) {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting created of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Long actualCreated = actual.getCreated();
    if (!Objects.areEqual(actualCreated, created)) {
      failWithMessage(assertjErrorMessage, actual, created, actualCreated);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder's datasetId is equal to the given one.
   * @param datasetId the given datasetId to compare the actual GAReadGroup.Builder's datasetId to.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder's datasetId is not equal to the given one.
   */
  public GAReadGroupBuilderAssert hasDatasetId(String datasetId) {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting datasetId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualDatasetId = actual.getDatasetId();
    if (!Objects.areEqual(actualDatasetId, datasetId)) {
      failWithMessage(assertjErrorMessage, actual, datasetId, actualDatasetId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder's description is equal to the given one.
   * @param description the given description to compare the actual GAReadGroup.Builder's description to.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder's description is not equal to the given one.
   */
  public GAReadGroupBuilderAssert hasDescription(String description) {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting description of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualDescription = actual.getDescription();
    if (!Objects.areEqual(actualDescription, description)) {
      failWithMessage(assertjErrorMessage, actual, description, actualDescription);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder's experiment is equal to the given one.
   * @param experiment the given experiment to compare the actual GAReadGroup.Builder's experiment to.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder's experiment is not equal to the given one.
   */
  public GAReadGroupBuilderAssert hasExperiment(GAExperiment experiment) {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting experiment of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    GAExperiment actualExperiment = actual.getExperiment();
    if (!Objects.areEqual(actualExperiment, experiment)) {
      failWithMessage(assertjErrorMessage, actual, experiment, actualExperiment);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder's id is equal to the given one.
   * @param id the given id to compare the actual GAReadGroup.Builder's id to.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder's id is not equal to the given one.
   */
  public GAReadGroupBuilderAssert hasId(String id) {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting id of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualId = actual.getId();
    if (!Objects.areEqual(actualId, id)) {
      failWithMessage(assertjErrorMessage, actual, id, actualId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder's info is equal to the given one.
   * @param info the given info to compare the actual GAReadGroup.Builder's info to.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder's info is not equal to the given one.
   */
  public GAReadGroupBuilderAssert hasInfo(java.util.Map info) {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting info of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    java.util.Map actualInfo = actual.getInfo();
    if (!Objects.areEqual(actualInfo, info)) {
      failWithMessage(assertjErrorMessage, actual, info, actualInfo);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder's name is equal to the given one.
   * @param name the given name to compare the actual GAReadGroup.Builder's name to.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder's name is not equal to the given one.
   */
  public GAReadGroupBuilderAssert hasName(String name) {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting name of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualName = actual.getName();
    if (!Objects.areEqual(actualName, name)) {
      failWithMessage(assertjErrorMessage, actual, name, actualName);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder's predictedInsertSize is equal to the given one.
   * @param predictedInsertSize the given predictedInsertSize to compare the actual GAReadGroup.Builder's predictedInsertSize to.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder's predictedInsertSize is not equal to the given one.
   */
  public GAReadGroupBuilderAssert hasPredictedInsertSize(Integer predictedInsertSize) {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting predictedInsertSize of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Integer actualPredictedInsertSize = actual.getPredictedInsertSize();
    if (!Objects.areEqual(actualPredictedInsertSize, predictedInsertSize)) {
      failWithMessage(assertjErrorMessage, actual, predictedInsertSize, actualPredictedInsertSize);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder's programs contains the given GAProgram elements.
   * @param programs the given elements that should be contained in actual GAReadGroup.Builder's programs.
   * @return this assertion object.
   * @throws AssertionError if the actual GAReadGroup.Builder's programs does not contain all given GAProgram elements.
   */
  public GAReadGroupBuilderAssert hasPrograms(GAProgram... programs) {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check that given GAProgram varargs is not null.
    if (programs == null) failWithMessage("Expecting programs parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getPrograms(), programs);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder's programs contains <b>only<b> the given GAProgram elements and nothing else in whatever order.
   * @param programs the given elements that should be contained in actual GAReadGroup.Builder's programs.
   * @return this assertion object.
   * @throws AssertionError if the actual GAReadGroup.Builder's programs does not contain all given GAProgram elements.
   */
  public GAReadGroupBuilderAssert hasOnlyPrograms(GAProgram... programs) {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check that given GAProgram varargs is not null.
    if (programs == null) failWithMessage("Expecting programs parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getPrograms(), programs);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder's programs does not contain the given GAProgram elements.
   *
   * @param programs the given elements that should not be in actual GAReadGroup.Builder's programs.
   * @return this assertion object.
   * @throws AssertionError if the actual GAReadGroup.Builder's programs contains any given GAProgram elements.
   */
  public GAReadGroupBuilderAssert doesNotHavePrograms(GAProgram... programs) {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check that given GAProgram varargs is not null.
    if (programs == null) failWithMessage("Expecting programs parameter not to be null.");
    
    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getPrograms(), programs);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder has no programs.
   * @return this assertion object.
   * @throws AssertionError if the actual GAReadGroup.Builder's programs is not empty.
   */
  public GAReadGroupBuilderAssert hasNoPrograms() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have programs but had :\n  <%s>";
    
    // check
    if (actual.getPrograms().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getPrograms());
    }
    
    // return the current assertion for method chaining
    return this;
  }
  

  /**
   * Verifies that the actual GAReadGroup.Builder's referenceSetId is equal to the given one.
   * @param referenceSetId the given referenceSetId to compare the actual GAReadGroup.Builder's referenceSetId to.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder's referenceSetId is not equal to the given one.
   */
  public GAReadGroupBuilderAssert hasReferenceSetId(String referenceSetId) {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting referenceSetId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualReferenceSetId = actual.getReferenceSetId();
    if (!Objects.areEqual(actualReferenceSetId, referenceSetId)) {
      failWithMessage(assertjErrorMessage, actual, referenceSetId, actualReferenceSetId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder's sampleId is equal to the given one.
   * @param sampleId the given sampleId to compare the actual GAReadGroup.Builder's sampleId to.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder's sampleId is not equal to the given one.
   */
  public GAReadGroupBuilderAssert hasSampleId(String sampleId) {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting sampleId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualSampleId = actual.getSampleId();
    if (!Objects.areEqual(actualSampleId, sampleId)) {
      failWithMessage(assertjErrorMessage, actual, sampleId, actualSampleId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder's updated is equal to the given one.
   * @param updated the given updated to compare the actual GAReadGroup.Builder's updated to.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder's updated is not equal to the given one.
   */
  public GAReadGroupBuilderAssert hasUpdated(Long updated) {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting updated of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Long actualUpdated = actual.getUpdated();
    if (!Objects.areEqual(actualUpdated, updated)) {
      failWithMessage(assertjErrorMessage, actual, updated, actualUpdated);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder has created.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder does not have created.
   */
  public GAReadGroupBuilderAssert hasCreated() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasCreated()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder has created but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder does not have created.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder has created.
   */
  public GAReadGroupBuilderAssert doesNotHaveCreated() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasCreated()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder does not have created but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder has dataset id.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder does not have dataset id.
   */
  public GAReadGroupBuilderAssert hasDatasetId() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasDatasetId()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder has dataset id but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder does not have dataset id.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder has dataset id.
   */
  public GAReadGroupBuilderAssert doesNotHaveDatasetId() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasDatasetId()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder does not have dataset id but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder has description.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder does not have description.
   */
  public GAReadGroupBuilderAssert hasDescription() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasDescription()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder has description but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder does not have description.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder has description.
   */
  public GAReadGroupBuilderAssert doesNotHaveDescription() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasDescription()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder does not have description but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder has experiment.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder does not have experiment.
   */
  public GAReadGroupBuilderAssert hasExperiment() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasExperiment()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder has experiment but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder does not have experiment.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder has experiment.
   */
  public GAReadGroupBuilderAssert doesNotHaveExperiment() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasExperiment()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder does not have experiment but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder has id.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder does not have id.
   */
  public GAReadGroupBuilderAssert hasId() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasId()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder has id but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder does not have id.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder has id.
   */
  public GAReadGroupBuilderAssert doesNotHaveId() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasId()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder does not have id but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder has info.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder does not have info.
   */
  public GAReadGroupBuilderAssert hasInfo() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasInfo()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder has info but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder does not have info.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder has info.
   */
  public GAReadGroupBuilderAssert doesNotHaveInfo() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasInfo()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder does not have info but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder has name.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder does not have name.
   */
  public GAReadGroupBuilderAssert hasName() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasName()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder has name but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder does not have name.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder has name.
   */
  public GAReadGroupBuilderAssert doesNotHaveName() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasName()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder does not have name but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder has predicted insert size.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder does not have predicted insert size.
   */
  public GAReadGroupBuilderAssert hasPredictedInsertSize() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasPredictedInsertSize()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder has predicted insert size but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder does not have predicted insert size.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder has predicted insert size.
   */
  public GAReadGroupBuilderAssert doesNotHavePredictedInsertSize() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasPredictedInsertSize()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder does not have predicted insert size but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder has programs.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder does not have programs.
   */
  public GAReadGroupBuilderAssert hasPrograms() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasPrograms()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder has programs but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder does not have programs.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder has programs.
   */
  public GAReadGroupBuilderAssert doesNotHavePrograms() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasPrograms()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder does not have programs but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder has reference set id.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder does not have reference set id.
   */
  public GAReadGroupBuilderAssert hasReferenceSetId() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasReferenceSetId()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder has reference set id but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder does not have reference set id.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder has reference set id.
   */
  public GAReadGroupBuilderAssert doesNotHaveReferenceSetId() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasReferenceSetId()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder does not have reference set id but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder has sample id.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder does not have sample id.
   */
  public GAReadGroupBuilderAssert hasSampleId() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasSampleId()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder has sample id but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder does not have sample id.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder has sample id.
   */
  public GAReadGroupBuilderAssert doesNotHaveSampleId() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasSampleId()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder does not have sample id but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder has updated.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder does not have updated.
   */
  public GAReadGroupBuilderAssert hasUpdated() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasUpdated()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder has updated but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GAReadGroup.Builder does not have updated.
   * @return this assertion object.
   * @throws AssertionError - if the actual GAReadGroup.Builder has updated.
   */
  public GAReadGroupBuilderAssert doesNotHaveUpdated() {
    // check that actual GAReadGroup.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasUpdated()) {
      failWithMessage("\nExpecting that actual GAReadGroup.Builder does not have updated but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

}