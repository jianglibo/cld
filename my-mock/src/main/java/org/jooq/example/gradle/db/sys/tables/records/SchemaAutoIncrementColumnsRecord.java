/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.sys.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.example.gradle.db.sys.tables.SchemaAutoIncrementColumns;
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
public class SchemaAutoIncrementColumnsRecord extends TableRecordImpl<SchemaAutoIncrementColumnsRecord> implements Record10<String, String, String, String, String, Integer, Integer, ULong, ULong, BigDecimal> {

	private static final long serialVersionUID = -164202189;

	/**
	 * Setter for <code>sys.schema_auto_increment_columns.table_schema</code>.
	 */
	public void setTableSchema(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.schema_auto_increment_columns.table_schema</code>.
	 */
	public String getTableSchema() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.schema_auto_increment_columns.table_name</code>.
	 */
	public void setTableName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.schema_auto_increment_columns.table_name</code>.
	 */
	public String getTableName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>sys.schema_auto_increment_columns.column_name</code>.
	 */
	public void setColumnName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.schema_auto_increment_columns.column_name</code>.
	 */
	public String getColumnName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>sys.schema_auto_increment_columns.data_type</code>.
	 */
	public void setDataType(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.schema_auto_increment_columns.data_type</code>.
	 */
	public String getDataType() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>sys.schema_auto_increment_columns.column_type</code>.
	 */
	public void setColumnType(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.schema_auto_increment_columns.column_type</code>.
	 */
	public String getColumnType() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>sys.schema_auto_increment_columns.is_signed</code>.
	 */
	public void setIsSigned(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sys.schema_auto_increment_columns.is_signed</code>.
	 */
	public Integer getIsSigned() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>sys.schema_auto_increment_columns.is_unsigned</code>.
	 */
	public void setIsUnsigned(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sys.schema_auto_increment_columns.is_unsigned</code>.
	 */
	public Integer getIsUnsigned() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>sys.schema_auto_increment_columns.max_value</code>.
	 */
	public void setMaxValue(ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sys.schema_auto_increment_columns.max_value</code>.
	 */
	public ULong getMaxValue() {
		return (ULong) getValue(7);
	}

	/**
	 * Setter for <code>sys.schema_auto_increment_columns.auto_increment</code>.
	 */
	public void setAutoIncrement(ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>sys.schema_auto_increment_columns.auto_increment</code>.
	 */
	public ULong getAutoIncrement() {
		return (ULong) getValue(8);
	}

	/**
	 * Setter for <code>sys.schema_auto_increment_columns.auto_increment_ratio</code>.
	 */
	public void setAutoIncrementRatio(BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>sys.schema_auto_increment_columns.auto_increment_ratio</code>.
	 */
	public BigDecimal getAutoIncrementRatio() {
		return (BigDecimal) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<String, String, String, String, String, Integer, Integer, ULong, ULong, BigDecimal> fieldsRow() {
		return (Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row10<String, String, String, String, String, Integer, Integer, ULong, ULong, BigDecimal> valuesRow() {
		return (Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return SchemaAutoIncrementColumns.SCHEMA_AUTO_INCREMENT_COLUMNS.TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return SchemaAutoIncrementColumns.SCHEMA_AUTO_INCREMENT_COLUMNS.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return SchemaAutoIncrementColumns.SCHEMA_AUTO_INCREMENT_COLUMNS.COLUMN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return SchemaAutoIncrementColumns.SCHEMA_AUTO_INCREMENT_COLUMNS.DATA_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return SchemaAutoIncrementColumns.SCHEMA_AUTO_INCREMENT_COLUMNS.COLUMN_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return SchemaAutoIncrementColumns.SCHEMA_AUTO_INCREMENT_COLUMNS.IS_SIGNED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return SchemaAutoIncrementColumns.SCHEMA_AUTO_INCREMENT_COLUMNS.IS_UNSIGNED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field8() {
		return SchemaAutoIncrementColumns.SCHEMA_AUTO_INCREMENT_COLUMNS.MAX_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field9() {
		return SchemaAutoIncrementColumns.SCHEMA_AUTO_INCREMENT_COLUMNS.AUTO_INCREMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field10() {
		return SchemaAutoIncrementColumns.SCHEMA_AUTO_INCREMENT_COLUMNS.AUTO_INCREMENT_RATIO;
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
		return getColumnName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getDataType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getColumnType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getIsSigned();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getIsUnsigned();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value8() {
		return getMaxValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value9() {
		return getAutoIncrement();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value10() {
		return getAutoIncrementRatio();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaAutoIncrementColumnsRecord value1(String value) {
		setTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaAutoIncrementColumnsRecord value2(String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaAutoIncrementColumnsRecord value3(String value) {
		setColumnName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaAutoIncrementColumnsRecord value4(String value) {
		setDataType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaAutoIncrementColumnsRecord value5(String value) {
		setColumnType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaAutoIncrementColumnsRecord value6(Integer value) {
		setIsSigned(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaAutoIncrementColumnsRecord value7(Integer value) {
		setIsUnsigned(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaAutoIncrementColumnsRecord value8(ULong value) {
		setMaxValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaAutoIncrementColumnsRecord value9(ULong value) {
		setAutoIncrement(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaAutoIncrementColumnsRecord value10(BigDecimal value) {
		setAutoIncrementRatio(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SchemaAutoIncrementColumnsRecord values(String value1, String value2, String value3, String value4, String value5, Integer value6, Integer value7, ULong value8, ULong value9, BigDecimal value10) {
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
	 * Create a detached SchemaAutoIncrementColumnsRecord
	 */
	public SchemaAutoIncrementColumnsRecord() {
		super(SchemaAutoIncrementColumns.SCHEMA_AUTO_INCREMENT_COLUMNS);
	}

	/**
	 * Create a detached, initialised SchemaAutoIncrementColumnsRecord
	 */
	public SchemaAutoIncrementColumnsRecord(String tableSchema, String tableName, String columnName, String dataType, String columnType, Integer isSigned, Integer isUnsigned, ULong maxValue, ULong autoIncrement, BigDecimal autoIncrementRatio) {
		super(SchemaAutoIncrementColumns.SCHEMA_AUTO_INCREMENT_COLUMNS);

		setValue(0, tableSchema);
		setValue(1, tableName);
		setValue(2, columnName);
		setValue(3, dataType);
		setValue(4, columnType);
		setValue(5, isSigned);
		setValue(6, isUnsigned);
		setValue(7, maxValue);
		setValue(8, autoIncrement);
		setValue(9, autoIncrementRatio);
	}
}
