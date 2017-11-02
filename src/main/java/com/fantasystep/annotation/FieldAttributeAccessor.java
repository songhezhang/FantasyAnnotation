package com.fantasystep.annotation;

public class FieldAttributeAccessor {

    private java.lang.Class<?> listType;

    private java.lang.Class<? extends java.lang.Enum<?>> enumType;

    private com.fantasystep.annotation.Storage storage;

    private java.lang.Class<? extends com.fantasystep.domain.Node> relationType;

    private java.lang.Class<?>[] mapType;

    private boolean unique;

    private java.lang.String alias;

    private boolean encrypted;

    private com.fantasystep.annotation.SerializationType serializationType;

    private int serializationMaximumLength;

    private boolean sharedKey;

    private boolean required;

    private java.lang.String defaultValue;

    private java.lang.String foreignKey;

    private java.lang.Class<? extends com.fantasystep.annotation.ValueOptions> valueOptions;

    private com.fantasystep.annotation.StorageModelType storageModel;

    private java.lang.String storageName;

    private boolean propertyField;

    private com.fantasystep.helper.PropertyGroups group;

    private int order;

    private com.fantasystep.helper.Cardinality cardinality;

    private java.lang.String label;

    private com.fantasystep.annotation.ControlType controlType;

    private com.fantasystep.helper.Validation validate;

    private java.lang.String customValidation;

    private java.lang.String validationErrorMessage;

    private boolean isSiblingUnique;

    private java.lang.String groupLabel;

    private boolean specialDisplay;

    private java.lang.String[] dynamicInfo;

    private java.lang.String jsonTemplate;

    public java.lang.Class<?> getListType() {
        return listType;
    }

    public java.lang.Class<? extends java.lang.Enum<?>> getEnumType() {
        return enumType;
    }

    public com.fantasystep.annotation.Storage getStorage() {
        return storage;
    }

    public java.lang.Class<? extends com.fantasystep.domain.Node> getRelationType() {
        return relationType;
    }

    public java.lang.Class<?>[] getMapType() {
        return mapType;
    }

    public boolean getUnique() {
        return unique;
    }

    public java.lang.String getAlias() {
        return alias;
    }

    public boolean getEncrypted() {
        return encrypted;
    }

    public com.fantasystep.annotation.SerializationType getSerializationType() {
        return serializationType;
    }

    public int getSerializationMaximumLength() {
        return serializationMaximumLength;
    }

    public boolean getSharedKey() {
        return sharedKey;
    }

    public boolean getRequired() {
        return required;
    }

    public java.lang.String getDefaultValue() {
        return defaultValue;
    }

    public java.lang.String getForeignKey() {
        return foreignKey;
    }

    public java.lang.Class<? extends com.fantasystep.annotation.ValueOptions> getValueOptions() {
        return valueOptions;
    }

    public com.fantasystep.annotation.StorageModelType getStorageModel() {
        return storageModel;
    }

    public java.lang.String getStorageName() {
        return storageName;
    }

    public boolean getPropertyField() {
        return propertyField;
    }

    public com.fantasystep.helper.PropertyGroups getGroup() {
        return group;
    }

    public int getOrder() {
        return order;
    }

    public com.fantasystep.helper.Cardinality getCardinality() {
        return cardinality;
    }

    public java.lang.String getLabel() {
        return label;
    }

    public com.fantasystep.annotation.ControlType getControlType() {
        return controlType;
    }

    public com.fantasystep.helper.Validation getValidate() {
        return validate;
    }

    public java.lang.String getCustomValidation() {
        return customValidation;
    }

    public java.lang.String getValidationErrorMessage() {
        return validationErrorMessage;
    }

    public boolean getIsSiblingUnique() {
        return isSiblingUnique;
    }

    public java.lang.String getGroupLabel() {
        return groupLabel;
    }

    public boolean getSpecialDisplay() {
        return specialDisplay;
    }

    public java.lang.String[] getDynamicInfo() {
        return dynamicInfo;
    }

    public java.lang.String getJsonTemplate() {
        return jsonTemplate;
    }

    public void setListType(java.lang.Class<?> listType) {
        this.listType = listType;
    }

    public void setEnumType(java.lang.Class<? extends java.lang.Enum<?>> enumType) {
        this.enumType = enumType;
    }

    public void setStorage(com.fantasystep.annotation.Storage storage) {
        this.storage = storage;
    }

    public void setRelationType(java.lang.Class<? extends com.fantasystep.domain.Node> relationType) {
        this.relationType = relationType;
    }

    public void setMapType(java.lang.Class<?>[] mapType) {
        this.mapType = mapType;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }

    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    public void setSerializationType(com.fantasystep.annotation.SerializationType serializationType) {
        this.serializationType = serializationType;
    }

    public void setSerializationMaximumLength(int serializationMaximumLength) {
        this.serializationMaximumLength = serializationMaximumLength;
    }

    public void setSharedKey(boolean sharedKey) {
        this.sharedKey = sharedKey;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public void setForeignKey(java.lang.String foreignKey) {
        this.foreignKey = foreignKey;
    }

    public void setValueOptions(java.lang.Class<? extends com.fantasystep.annotation.ValueOptions> valueOptions) {
        this.valueOptions = valueOptions;
    }

    public void setStorageModel(com.fantasystep.annotation.StorageModelType storageModel) {
        this.storageModel = storageModel;
    }

    public void setStorageName(java.lang.String storageName) {
        this.storageName = storageName;
    }

    public void setPropertyField(boolean propertyField) {
        this.propertyField = propertyField;
    }

    public void setGroup(com.fantasystep.helper.PropertyGroups group) {
        this.group = group;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setCardinality(com.fantasystep.helper.Cardinality cardinality) {
        this.cardinality = cardinality;
    }

    public void setLabel(java.lang.String label) {
        this.label = label;
    }

    public void setControlType(com.fantasystep.annotation.ControlType controlType) {
        this.controlType = controlType;
    }

    public void setValidate(com.fantasystep.helper.Validation validate) {
        this.validate = validate;
    }

    public void setCustomValidation(java.lang.String customValidation) {
        this.customValidation = customValidation;
    }

    public void setValidationErrorMessage(java.lang.String validationErrorMessage) {
        this.validationErrorMessage = validationErrorMessage;
    }

    public void setIsSiblingUnique(boolean isSiblingUnique) {
        this.isSiblingUnique = isSiblingUnique;
    }

    public void setGroupLabel(java.lang.String groupLabel) {
        this.groupLabel = groupLabel;
    }

    public void setSpecialDisplay(boolean specialDisplay) {
        this.specialDisplay = specialDisplay;
    }

    public void setDynamicInfo(java.lang.String[] dynamicInfo) {
        this.dynamicInfo = dynamicInfo;
    }

    public void setJsonTemplate(java.lang.String jsonTemplate) {
        this.jsonTemplate = jsonTemplate;
    }

}
