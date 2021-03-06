/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.sys.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.example.gradle.db.sys.tables.SchemaTablesWithFullTableScans;
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
public class SchemaTablesWithFullTableScansRecord extends TableRecordImpl<SchemaTablesWithFullTableScansRecord> implements Record4<String, String, ULong, String> {

	private static final long serialVersionUID = 239559948;

	/**
	 * Setter for <code>sys.schema_tables_with_full_table_scans.object_schema</code>.
	 */
	public void setObjectSchema(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.schema_tables_with_full_table_scans.object_schema</code>.
	 */
	public String getObjectSchema() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.schema_tables_with_full_table_scans.object_name</code>.
	 */
	public void setObjectName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.schema_tables_with_full_table_scans.object_name</code>.
	 */
	public String getObjectName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>sys.schema_tables_with_full_table_scans.rows_full_scanned</code>.
	 */
	public void setRowsFullScanned(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.schema_tables_with_full_table_scans.rows_full_scanned</code>.
	 */
	public ULong getRowsFullScanned() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>sys.schema_tables_with_full_table_scans.latency</code>.
	 */
	public void setLatency(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.schema_tables_with_full_table_scans.latency</code>.
	 */
	public String getLatency() {
		return (String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, String, ULong, String> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, String, ULong, String> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return SchemaTablesWithFullTableScans.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS.OBJECT_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return SchemaTablesWithFullTableScans.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS.OBJECT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field3() {
		return SchemaTablesWithFullTableScans.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS.ROWS_FULL_SCANNED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return SchemaTablesWithFullTableScans.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS.LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getObjectSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getObjectName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value3() {
		return getRowsFullScanned();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaTablesWithFullTableScansRecord value1(String value) {
		setObjectSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaTablesWithFullTableScansRecord value2(String value) {
		setObjectName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaTablesWithFullTableScansRecord value3(ULong value) {
		setRowsFullScanned(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaTablesWithFullTableScansRecord value4(String value) {
		setLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaTablesWithFullTableScansRecord values(String value1, String value2, ULong value3, String value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SchemaTablesWithFullTableScansRecord
	 */
	public SchemaTablesWithFullTableScansRecord() {
		super(SchemaTablesWithFullTableScans.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS);
	}

	/**
	 * Create a detached, initialised SchemaTablesWithFullTableScansRecord
	 */
	public SchemaTablesWithFullTableScansRecord(String objectSchema, String objectName, ULong rowsFullScanned, String latency) {
		super(SchemaTablesWithFullTableScans.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS);

		setValue(0, objectSchema);
		setValue(1, objectName);
		setValue(2, rowsFullScanned);
		setValue(3, latency);
	}
}
