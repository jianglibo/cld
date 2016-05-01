/**
 * This class is generated by jOOQ
 */
package com.mymock.db.performance_schema.tables.records;


import com.mymock.db.performance_schema.enums.SetupObjectsEnabled;
import com.mymock.db.performance_schema.enums.SetupObjectsObjectType;
import com.mymock.db.performance_schema.enums.SetupObjectsTimed;
import com.mymock.db.performance_schema.tables.SetupObjects;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SetupObjectsRecord extends TableRecordImpl<SetupObjectsRecord> implements Record5<SetupObjectsObjectType, String, String, SetupObjectsEnabled, SetupObjectsTimed> {

	private static final long serialVersionUID = 1886073739;

	/**
	 * Setter for <code>performance_schema.setup_objects.OBJECT_TYPE</code>.
	 */
	public void setObjectType(SetupObjectsObjectType value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.setup_objects.OBJECT_TYPE</code>.
	 */
	public SetupObjectsObjectType getObjectType() {
		return (SetupObjectsObjectType) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.setup_objects.OBJECT_SCHEMA</code>.
	 */
	public void setObjectSchema(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.setup_objects.OBJECT_SCHEMA</code>.
	 */
	public String getObjectSchema() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.setup_objects.OBJECT_NAME</code>.
	 */
	public void setObjectName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.setup_objects.OBJECT_NAME</code>.
	 */
	public String getObjectName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.setup_objects.ENABLED</code>.
	 */
	public void setEnabled(SetupObjectsEnabled value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.setup_objects.ENABLED</code>.
	 */
	public SetupObjectsEnabled getEnabled() {
		return (SetupObjectsEnabled) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.setup_objects.TIMED</code>.
	 */
	public void setTimed(SetupObjectsTimed value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.setup_objects.TIMED</code>.
	 */
	public SetupObjectsTimed getTimed() {
		return (SetupObjectsTimed) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<SetupObjectsObjectType, String, String, SetupObjectsEnabled, SetupObjectsTimed> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<SetupObjectsObjectType, String, String, SetupObjectsEnabled, SetupObjectsTimed> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<SetupObjectsObjectType> field1() {
		return SetupObjects.SETUP_OBJECTS.OBJECT_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return SetupObjects.SETUP_OBJECTS.OBJECT_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return SetupObjects.SETUP_OBJECTS.OBJECT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<SetupObjectsEnabled> field4() {
		return SetupObjects.SETUP_OBJECTS.ENABLED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<SetupObjectsTimed> field5() {
		return SetupObjects.SETUP_OBJECTS.TIMED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SetupObjectsObjectType value1() {
		return getObjectType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getObjectSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getObjectName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SetupObjectsEnabled value4() {
		return getEnabled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SetupObjectsTimed value5() {
		return getTimed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SetupObjectsRecord value1(SetupObjectsObjectType value) {
		setObjectType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SetupObjectsRecord value2(String value) {
		setObjectSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SetupObjectsRecord value3(String value) {
		setObjectName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SetupObjectsRecord value4(SetupObjectsEnabled value) {
		setEnabled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SetupObjectsRecord value5(SetupObjectsTimed value) {
		setTimed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SetupObjectsRecord values(SetupObjectsObjectType value1, String value2, String value3, SetupObjectsEnabled value4, SetupObjectsTimed value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SetupObjectsRecord
	 */
	public SetupObjectsRecord() {
		super(SetupObjects.SETUP_OBJECTS);
	}

	/**
	 * Create a detached, initialised SetupObjectsRecord
	 */
	public SetupObjectsRecord(SetupObjectsObjectType objectType, String objectSchema, String objectName, SetupObjectsEnabled enabled, SetupObjectsTimed timed) {
		super(SetupObjects.SETUP_OBJECTS);

		setValue(0, objectType);
		setValue(1, objectSchema);
		setValue(2, objectName);
		setValue(3, enabled);
		setValue(4, timed);
	}
}
