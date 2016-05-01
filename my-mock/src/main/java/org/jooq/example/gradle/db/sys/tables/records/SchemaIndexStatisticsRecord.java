/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.sys.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.example.gradle.db.sys.tables.SchemaIndexStatistics;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


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
public class SchemaIndexStatisticsRecord extends TableRecordImpl<SchemaIndexStatisticsRecord> implements Record11<String, String, String, ULong, String, ULong, String, ULong, String, ULong, String> {

	private static final long serialVersionUID = -1381652392;

	/**
	 * Setter for <code>sys.schema_index_statistics.table_schema</code>.
	 */
	public void setTableSchema(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.schema_index_statistics.table_schema</code>.
	 */
	public String getTableSchema() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.schema_index_statistics.table_name</code>.
	 */
	public void setTableName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.schema_index_statistics.table_name</code>.
	 */
	public String getTableName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>sys.schema_index_statistics.index_name</code>.
	 */
	public void setIndexName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.schema_index_statistics.index_name</code>.
	 */
	public String getIndexName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>sys.schema_index_statistics.rows_selected</code>.
	 */
	public void setRowsSelected(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.schema_index_statistics.rows_selected</code>.
	 */
	public ULong getRowsSelected() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>sys.schema_index_statistics.select_latency</code>.
	 */
	public void setSelectLatency(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.schema_index_statistics.select_latency</code>.
	 */
	public String getSelectLatency() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>sys.schema_index_statistics.rows_inserted</code>.
	 */
	public void setRowsInserted(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sys.schema_index_statistics.rows_inserted</code>.
	 */
	public ULong getRowsInserted() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>sys.schema_index_statistics.insert_latency</code>.
	 */
	public void setInsertLatency(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sys.schema_index_statistics.insert_latency</code>.
	 */
	public String getInsertLatency() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>sys.schema_index_statistics.rows_updated</code>.
	 */
	public void setRowsUpdated(ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sys.schema_index_statistics.rows_updated</code>.
	 */
	public ULong getRowsUpdated() {
		return (ULong) getValue(7);
	}

	/**
	 * Setter for <code>sys.schema_index_statistics.update_latency</code>.
	 */
	public void setUpdateLatency(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>sys.schema_index_statistics.update_latency</code>.
	 */
	public String getUpdateLatency() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>sys.schema_index_statistics.rows_deleted</code>.
	 */
	public void setRowsDeleted(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>sys.schema_index_statistics.rows_deleted</code>.
	 */
	public ULong getRowsDeleted() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>sys.schema_index_statistics.delete_latency</code>.
	 */
	public void setDeleteLatency(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>sys.schema_index_statistics.delete_latency</code>.
	 */
	public String getDeleteLatency() {
		return (String) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<String, String, String, ULong, String, ULong, String, ULong, String, ULong, String> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<String, String, String, ULong, String, ULong, String, ULong, String, ULong, String> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.INDEX_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field4() {
		return SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.ROWS_SELECTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.SELECT_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field6() {
		return SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.ROWS_INSERTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.INSERT_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field8() {
		return SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.ROWS_UPDATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.UPDATE_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field10() {
		return SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.ROWS_DELETED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS.DELETE_LATENCY;
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
	public ULong value4() {
		return getRowsSelected();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getSelectLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value6() {
		return getRowsInserted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getInsertLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value8() {
		return getRowsUpdated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getUpdateLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value10() {
		return getRowsDeleted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getDeleteLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaIndexStatisticsRecord value1(String value) {
		setTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaIndexStatisticsRecord value2(String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaIndexStatisticsRecord value3(String value) {
		setIndexName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaIndexStatisticsRecord value4(ULong value) {
		setRowsSelected(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaIndexStatisticsRecord value5(String value) {
		setSelectLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaIndexStatisticsRecord value6(ULong value) {
		setRowsInserted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaIndexStatisticsRecord value7(String value) {
		setInsertLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaIndexStatisticsRecord value8(ULong value) {
		setRowsUpdated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaIndexStatisticsRecord value9(String value) {
		setUpdateLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaIndexStatisticsRecord value10(ULong value) {
		setRowsDeleted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaIndexStatisticsRecord value11(String value) {
		setDeleteLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaIndexStatisticsRecord values(String value1, String value2, String value3, ULong value4, String value5, ULong value6, String value7, ULong value8, String value9, ULong value10, String value11) {
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
		value11(value11);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SchemaIndexStatisticsRecord
	 */
	public SchemaIndexStatisticsRecord() {
		super(SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS);
	}

	/**
	 * Create a detached, initialised SchemaIndexStatisticsRecord
	 */
	public SchemaIndexStatisticsRecord(String tableSchema, String tableName, String indexName, ULong rowsSelected, String selectLatency, ULong rowsInserted, String insertLatency, ULong rowsUpdated, String updateLatency, ULong rowsDeleted, String deleteLatency) {
		super(SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS);

		setValue(0, tableSchema);
		setValue(1, tableName);
		setValue(2, indexName);
		setValue(3, rowsSelected);
		setValue(4, selectLatency);
		setValue(5, rowsInserted);
		setValue(6, insertLatency);
		setValue(7, rowsUpdated);
		setValue(8, updateLatency);
		setValue(9, rowsDeleted);
		setValue(10, deleteLatency);
	}
}
