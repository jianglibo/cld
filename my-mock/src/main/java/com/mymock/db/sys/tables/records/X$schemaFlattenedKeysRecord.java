/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.tables.records;


import com.mymock.db.sys.tables.X$schemaFlattenedKeys;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$schemaFlattenedKeysRecord extends TableRecordImpl<X$schemaFlattenedKeysRecord> implements Record6<String, String, String, Long, Long, String> {

	private static final long serialVersionUID = -1580113249;

	/**
	 * Setter for <code>sys.x$schema_flattened_keys.table_schema</code>.
	 */
	public void setTableSchema(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.x$schema_flattened_keys.table_schema</code>.
	 */
	public String getTableSchema() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.x$schema_flattened_keys.table_name</code>.
	 */
	public void setTableName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.x$schema_flattened_keys.table_name</code>.
	 */
	public String getTableName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>sys.x$schema_flattened_keys.index_name</code>.
	 */
	public void setIndexName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.x$schema_flattened_keys.index_name</code>.
	 */
	public String getIndexName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>sys.x$schema_flattened_keys.non_unique</code>.
	 */
	public void setNonUnique(Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.x$schema_flattened_keys.non_unique</code>.
	 */
	public Long getNonUnique() {
		return (Long) getValue(3);
	}

	/**
	 * Setter for <code>sys.x$schema_flattened_keys.subpart_exists</code>.
	 */
	public void setSubpartExists(Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.x$schema_flattened_keys.subpart_exists</code>.
	 */
	public Long getSubpartExists() {
		return (Long) getValue(4);
	}

	/**
	 * Setter for <code>sys.x$schema_flattened_keys.index_columns</code>.
	 */
	public void setIndexColumns(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sys.x$schema_flattened_keys.index_columns</code>.
	 */
	public String getIndexColumns() {
		return (String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, String, Long, Long, String> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, String, Long, Long, String> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return X$schemaFlattenedKeys.X$SCHEMA_FLATTENED_KEYS.TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return X$schemaFlattenedKeys.X$SCHEMA_FLATTENED_KEYS.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return X$schemaFlattenedKeys.X$SCHEMA_FLATTENED_KEYS.INDEX_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field4() {
		return X$schemaFlattenedKeys.X$SCHEMA_FLATTENED_KEYS.NON_UNIQUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field5() {
		return X$schemaFlattenedKeys.X$SCHEMA_FLATTENED_KEYS.SUBPART_EXISTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return X$schemaFlattenedKeys.X$SCHEMA_FLATTENED_KEYS.INDEX_COLUMNS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getTableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getIndexName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value4() {
		return getNonUnique();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value5() {
		return getSubpartExists();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getIndexColumns();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaFlattenedKeysRecord value1(String value) {
		setTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaFlattenedKeysRecord value2(String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaFlattenedKeysRecord value3(String value) {
		setIndexName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaFlattenedKeysRecord value4(Long value) {
		setNonUnique(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaFlattenedKeysRecord value5(Long value) {
		setSubpartExists(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaFlattenedKeysRecord value6(String value) {
		setIndexColumns(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaFlattenedKeysRecord values(String value1, String value2, String value3, Long value4, Long value5, String value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached X$schemaFlattenedKeysRecord
	 */
	public X$schemaFlattenedKeysRecord() {
		super(X$schemaFlattenedKeys.X$SCHEMA_FLATTENED_KEYS);
	}

	/**
	 * Create a detached, initialised X$schemaFlattenedKeysRecord
	 */
	public X$schemaFlattenedKeysRecord(String tableSchema, String tableName, String indexName, Long nonUnique, Long subpartExists, String indexColumns) {
		super(X$schemaFlattenedKeys.X$SCHEMA_FLATTENED_KEYS);

		setValue(0, tableSchema);
		setValue(1, tableName);
		setValue(2, indexName);
		setValue(3, nonUnique);
		setValue(4, subpartExists);
		setValue(5, indexColumns);
	}
}
