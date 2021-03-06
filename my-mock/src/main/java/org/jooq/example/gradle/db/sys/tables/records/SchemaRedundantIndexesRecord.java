/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.sys.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.example.gradle.db.sys.tables.SchemaRedundantIndexes;
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
public class SchemaRedundantIndexesRecord extends TableRecordImpl<SchemaRedundantIndexesRecord> implements Record10<String, String, String, String, Long, String, String, Long, Integer, String> {

	private static final long serialVersionUID = -1925677689;

	/**
	 * Setter for <code>sys.schema_redundant_indexes.table_schema</code>.
	 */
	public void setTableSchema(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.schema_redundant_indexes.table_schema</code>.
	 */
	public String getTableSchema() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.schema_redundant_indexes.table_name</code>.
	 */
	public void setTableName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.schema_redundant_indexes.table_name</code>.
	 */
	public String getTableName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>sys.schema_redundant_indexes.redundant_index_name</code>.
	 */
	public void setRedundantIndexName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.schema_redundant_indexes.redundant_index_name</code>.
	 */
	public String getRedundantIndexName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>sys.schema_redundant_indexes.redundant_index_columns</code>.
	 */
	public void setRedundantIndexColumns(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.schema_redundant_indexes.redundant_index_columns</code>.
	 */
	public String getRedundantIndexColumns() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>sys.schema_redundant_indexes.redundant_index_non_unique</code>.
	 */
	public void setRedundantIndexNonUnique(Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.schema_redundant_indexes.redundant_index_non_unique</code>.
	 */
	public Long getRedundantIndexNonUnique() {
		return (Long) getValue(4);
	}

	/**
	 * Setter for <code>sys.schema_redundant_indexes.dominant_index_name</code>.
	 */
	public void setDominantIndexName(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sys.schema_redundant_indexes.dominant_index_name</code>.
	 */
	public String getDominantIndexName() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>sys.schema_redundant_indexes.dominant_index_columns</code>.
	 */
	public void setDominantIndexColumns(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sys.schema_redundant_indexes.dominant_index_columns</code>.
	 */
	public String getDominantIndexColumns() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>sys.schema_redundant_indexes.dominant_index_non_unique</code>.
	 */
	public void setDominantIndexNonUnique(Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sys.schema_redundant_indexes.dominant_index_non_unique</code>.
	 */
	public Long getDominantIndexNonUnique() {
		return (Long) getValue(7);
	}

	/**
	 * Setter for <code>sys.schema_redundant_indexes.subpart_exists</code>.
	 */
	public void setSubpartExists(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>sys.schema_redundant_indexes.subpart_exists</code>.
	 */
	public Integer getSubpartExists() {
		return (Integer) getValue(8);
	}

	/**
	 * Setter for <code>sys.schema_redundant_indexes.sql_drop_index</code>.
	 */
	public void setSqlDropIndex(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>sys.schema_redundant_indexes.sql_drop_index</code>.
	 */
	public String getSqlDropIndex() {
		return (String) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<String, String, String, String, Long, String, String, Long, Integer, String> fieldsRow() {
		return (Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<String, String, String, String, Long, String, String, Long, Integer, String> valuesRow() {
		return (Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return SchemaRedundantIndexes.SCHEMA_REDUNDANT_INDEXES.TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return SchemaRedundantIndexes.SCHEMA_REDUNDANT_INDEXES.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return SchemaRedundantIndexes.SCHEMA_REDUNDANT_INDEXES.REDUNDANT_INDEX_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return SchemaRedundantIndexes.SCHEMA_REDUNDANT_INDEXES.REDUNDANT_INDEX_COLUMNS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field5() {
		return SchemaRedundantIndexes.SCHEMA_REDUNDANT_INDEXES.REDUNDANT_INDEX_NON_UNIQUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return SchemaRedundantIndexes.SCHEMA_REDUNDANT_INDEXES.DOMINANT_INDEX_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return SchemaRedundantIndexes.SCHEMA_REDUNDANT_INDEXES.DOMINANT_INDEX_COLUMNS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field8() {
		return SchemaRedundantIndexes.SCHEMA_REDUNDANT_INDEXES.DOMINANT_INDEX_NON_UNIQUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return SchemaRedundantIndexes.SCHEMA_REDUNDANT_INDEXES.SUBPART_EXISTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return SchemaRedundantIndexes.SCHEMA_REDUNDANT_INDEXES.SQL_DROP_INDEX;
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
		return getRedundantIndexName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getRedundantIndexColumns();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value5() {
		return getRedundantIndexNonUnique();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getDominantIndexName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getDominantIndexColumns();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value8() {
		return getDominantIndexNonUnique();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getSubpartExists();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getSqlDropIndex();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaRedundantIndexesRecord value1(String value) {
		setTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaRedundantIndexesRecord value2(String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaRedundantIndexesRecord value3(String value) {
		setRedundantIndexName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaRedundantIndexesRecord value4(String value) {
		setRedundantIndexColumns(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaRedundantIndexesRecord value5(Long value) {
		setRedundantIndexNonUnique(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaRedundantIndexesRecord value6(String value) {
		setDominantIndexName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaRedundantIndexesRecord value7(String value) {
		setDominantIndexColumns(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaRedundantIndexesRecord value8(Long value) {
		setDominantIndexNonUnique(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaRedundantIndexesRecord value9(Integer value) {
		setSubpartExists(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaRedundantIndexesRecord value10(String value) {
		setSqlDropIndex(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaRedundantIndexesRecord values(String value1, String value2, String value3, String value4, Long value5, String value6, String value7, Long value8, Integer value9, String value10) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SchemaRedundantIndexesRecord
	 */
	public SchemaRedundantIndexesRecord() {
		super(SchemaRedundantIndexes.SCHEMA_REDUNDANT_INDEXES);
	}

	/**
	 * Create a detached, initialised SchemaRedundantIndexesRecord
	 */
	public SchemaRedundantIndexesRecord(String tableSchema, String tableName, String redundantIndexName, String redundantIndexColumns, Long redundantIndexNonUnique, String dominantIndexName, String dominantIndexColumns, Long dominantIndexNonUnique, Integer subpartExists, String sqlDropIndex) {
		super(SchemaRedundantIndexes.SCHEMA_REDUNDANT_INDEXES);

		setValue(0, tableSchema);
		setValue(1, tableName);
		setValue(2, redundantIndexName);
		setValue(3, redundantIndexColumns);
		setValue(4, redundantIndexNonUnique);
		setValue(5, dominantIndexName);
		setValue(6, dominantIndexColumns);
		setValue(7, dominantIndexNonUnique);
		setValue(8, subpartExists);
		setValue(9, sqlDropIndex);
	}
}
