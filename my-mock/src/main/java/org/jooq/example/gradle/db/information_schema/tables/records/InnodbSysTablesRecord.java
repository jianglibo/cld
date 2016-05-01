/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.example.gradle.db.information_schema.tables.InnodbSysTables;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


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
public class InnodbSysTablesRecord extends TableRecordImpl<InnodbSysTablesRecord> implements Record9<ULong, String, Integer, Integer, Integer, String, String, UInteger, String> {

	private static final long serialVersionUID = 601130123;

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLES.TABLE_ID</code>.
	 */
	public void setTableId(ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLES.TABLE_ID</code>.
	 */
	public ULong getTableId() {
		return (ULong) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLES.NAME</code>.
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLES.NAME</code>.
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLES.FLAG</code>.
	 */
	public void setFlag(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLES.FLAG</code>.
	 */
	public Integer getFlag() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLES.N_COLS</code>.
	 */
	public void setNCols(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLES.N_COLS</code>.
	 */
	public Integer getNCols() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLES.SPACE</code>.
	 */
	public void setSpace(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLES.SPACE</code>.
	 */
	public Integer getSpace() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLES.FILE_FORMAT</code>.
	 */
	public void setFileFormat(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLES.FILE_FORMAT</code>.
	 */
	public String getFileFormat() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLES.ROW_FORMAT</code>.
	 */
	public void setRowFormat(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLES.ROW_FORMAT</code>.
	 */
	public String getRowFormat() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLES.ZIP_PAGE_SIZE</code>.
	 */
	public void setZipPageSize(UInteger value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLES.ZIP_PAGE_SIZE</code>.
	 */
	public UInteger getZipPageSize() {
		return (UInteger) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.INNODB_SYS_TABLES.SPACE_TYPE</code>.
	 */
	public void setSpaceType(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_SYS_TABLES.SPACE_TYPE</code>.
	 */
	public String getSpaceType() {
		return (String) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<ULong, String, Integer, Integer, Integer, String, String, UInteger, String> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<ULong, String, Integer, Integer, Integer, String, String, UInteger, String> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field1() {
		return InnodbSysTables.INNODB_SYS_TABLES.TABLE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return InnodbSysTables.INNODB_SYS_TABLES.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return InnodbSysTables.INNODB_SYS_TABLES.FLAG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return InnodbSysTables.INNODB_SYS_TABLES.N_COLS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return InnodbSysTables.INNODB_SYS_TABLES.SPACE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return InnodbSysTables.INNODB_SYS_TABLES.FILE_FORMAT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return InnodbSysTables.INNODB_SYS_TABLES.ROW_FORMAT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field8() {
		return InnodbSysTables.INNODB_SYS_TABLES.ZIP_PAGE_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return InnodbSysTables.INNODB_SYS_TABLES.SPACE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value1() {
		return getTableId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getFlag();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getNCols();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getSpace();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getFileFormat();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getRowFormat();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value8() {
		return getZipPageSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getSpaceType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablesRecord value1(ULong value) {
		setTableId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablesRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablesRecord value3(Integer value) {
		setFlag(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablesRecord value4(Integer value) {
		setNCols(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablesRecord value5(Integer value) {
		setSpace(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablesRecord value6(String value) {
		setFileFormat(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablesRecord value7(String value) {
		setRowFormat(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablesRecord value8(UInteger value) {
		setZipPageSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablesRecord value9(String value) {
		setSpaceType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysTablesRecord values(ULong value1, String value2, Integer value3, Integer value4, Integer value5, String value6, String value7, UInteger value8, String value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbSysTablesRecord
	 */
	public InnodbSysTablesRecord() {
		super(InnodbSysTables.INNODB_SYS_TABLES);
	}

	/**
	 * Create a detached, initialised InnodbSysTablesRecord
	 */
	public InnodbSysTablesRecord(ULong tableId, String name, Integer flag, Integer nCols, Integer space, String fileFormat, String rowFormat, UInteger zipPageSize, String spaceType) {
		super(InnodbSysTables.INNODB_SYS_TABLES);

		setValue(0, tableId);
		setValue(1, name);
		setValue(2, flag);
		setValue(3, nCols);
		setValue(4, space);
		setValue(5, fileFormat);
		setValue(6, rowFormat);
		setValue(7, zipPageSize);
		setValue(8, spaceType);
	}
}
