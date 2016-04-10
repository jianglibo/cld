/**
 * This class is generated by jOOQ
 */
package com.mymock.db.information_schema.tables.records;


import com.mymock.db.information_schema.tables.Tablespaces;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;
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
public class TablespacesRecord extends TableRecordImpl<TablespacesRecord> implements Record9<String, String, String, String, ULong, ULong, ULong, ULong, String> {

	private static final long serialVersionUID = 1245051538;

	/**
	 * Setter for <code>information_schema.TABLESPACES.TABLESPACE_NAME</code>.
	 */
	public void setTablespaceName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.TABLESPACES.TABLESPACE_NAME</code>.
	 */
	public String getTablespaceName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.TABLESPACES.ENGINE</code>.
	 */
	public void setEngine(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.TABLESPACES.ENGINE</code>.
	 */
	public String getEngine() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.TABLESPACES.TABLESPACE_TYPE</code>.
	 */
	public void setTablespaceType(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.TABLESPACES.TABLESPACE_TYPE</code>.
	 */
	public String getTablespaceType() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.TABLESPACES.LOGFILE_GROUP_NAME</code>.
	 */
	public void setLogfileGroupName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.TABLESPACES.LOGFILE_GROUP_NAME</code>.
	 */
	public String getLogfileGroupName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.TABLESPACES.EXTENT_SIZE</code>.
	 */
	public void setExtentSize(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.TABLESPACES.EXTENT_SIZE</code>.
	 */
	public ULong getExtentSize() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.TABLESPACES.AUTOEXTEND_SIZE</code>.
	 */
	public void setAutoextendSize(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.TABLESPACES.AUTOEXTEND_SIZE</code>.
	 */
	public ULong getAutoextendSize() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.TABLESPACES.MAXIMUM_SIZE</code>.
	 */
	public void setMaximumSize(ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.TABLESPACES.MAXIMUM_SIZE</code>.
	 */
	public ULong getMaximumSize() {
		return (ULong) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.TABLESPACES.NODEGROUP_ID</code>.
	 */
	public void setNodegroupId(ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.TABLESPACES.NODEGROUP_ID</code>.
	 */
	public ULong getNodegroupId() {
		return (ULong) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.TABLESPACES.TABLESPACE_COMMENT</code>.
	 */
	public void setTablespaceComment(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.TABLESPACES.TABLESPACE_COMMENT</code>.
	 */
	public String getTablespaceComment() {
		return (String) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<String, String, String, String, ULong, ULong, ULong, ULong, String> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<String, String, String, String, ULong, ULong, ULong, ULong, String> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Tablespaces.TABLESPACES.TABLESPACE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Tablespaces.TABLESPACES.ENGINE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Tablespaces.TABLESPACES.TABLESPACE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Tablespaces.TABLESPACES.LOGFILE_GROUP_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field5() {
		return Tablespaces.TABLESPACES.EXTENT_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field6() {
		return Tablespaces.TABLESPACES.AUTOEXTEND_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field7() {
		return Tablespaces.TABLESPACES.MAXIMUM_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field8() {
		return Tablespaces.TABLESPACES.NODEGROUP_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return Tablespaces.TABLESPACES.TABLESPACE_COMMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getTablespaceName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getEngine();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTablespaceType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getLogfileGroupName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value5() {
		return getExtentSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value6() {
		return getAutoextendSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value7() {
		return getMaximumSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value8() {
		return getNodegroupId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getTablespaceComment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablespacesRecord value1(String value) {
		setTablespaceName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablespacesRecord value2(String value) {
		setEngine(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablespacesRecord value3(String value) {
		setTablespaceType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablespacesRecord value4(String value) {
		setLogfileGroupName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablespacesRecord value5(ULong value) {
		setExtentSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablespacesRecord value6(ULong value) {
		setAutoextendSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablespacesRecord value7(ULong value) {
		setMaximumSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablespacesRecord value8(ULong value) {
		setNodegroupId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablespacesRecord value9(String value) {
		setTablespaceComment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TablespacesRecord values(String value1, String value2, String value3, String value4, ULong value5, ULong value6, ULong value7, ULong value8, String value9) {
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
	 * Create a detached TablespacesRecord
	 */
	public TablespacesRecord() {
		super(Tablespaces.TABLESPACES);
	}

	/**
	 * Create a detached, initialised TablespacesRecord
	 */
	public TablespacesRecord(String tablespaceName, String engine, String tablespaceType, String logfileGroupName, ULong extentSize, ULong autoextendSize, ULong maximumSize, ULong nodegroupId, String tablespaceComment) {
		super(Tablespaces.TABLESPACES);

		setValue(0, tablespaceName);
		setValue(1, engine);
		setValue(2, tablespaceType);
		setValue(3, logfileGroupName);
		setValue(4, extentSize);
		setValue(5, autoextendSize);
		setValue(6, maximumSize);
		setValue(7, nodegroupId);
		setValue(8, tablespaceComment);
	}
}
