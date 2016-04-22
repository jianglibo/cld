/**
 * This class is generated by jOOQ
 */
package com.mymock.webproxy.db.information_schema.tables.records;


import com.mymock.webproxy.db.information_schema.tables.Views;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class ViewsRecord extends TableRecordImpl<ViewsRecord> implements Record9<String, String, String, String, String, String, String, String, Integer> {

	private static final long serialVersionUID = 693851696;

	/**
	 * Setter for <code>INFORMATION_SCHEMA.VIEWS.TABLE_CATALOG</code>.
	 */
	public void setTableCatalog(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.VIEWS.TABLE_CATALOG</code>.
	 */
	public String getTableCatalog() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.VIEWS.TABLE_SCHEMA</code>.
	 */
	public void setTableSchema(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.VIEWS.TABLE_SCHEMA</code>.
	 */
	public String getTableSchema() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.VIEWS.TABLE_NAME</code>.
	 */
	public void setTableName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.VIEWS.TABLE_NAME</code>.
	 */
	public String getTableName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.VIEWS.VIEW_DEFINITION</code>.
	 */
	public void setViewDefinition(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.VIEWS.VIEW_DEFINITION</code>.
	 */
	public String getViewDefinition() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.VIEWS.CHECK_OPTION</code>.
	 */
	public void setCheckOption(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.VIEWS.CHECK_OPTION</code>.
	 */
	public String getCheckOption() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.VIEWS.IS_UPDATABLE</code>.
	 */
	public void setIsUpdatable(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.VIEWS.IS_UPDATABLE</code>.
	 */
	public String getIsUpdatable() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.VIEWS.STATUS</code>.
	 */
	public void setStatus(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.VIEWS.STATUS</code>.
	 */
	public String getStatus() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.VIEWS.REMARKS</code>.
	 */
	public void setRemarks(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.VIEWS.REMARKS</code>.
	 */
	public String getRemarks() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.VIEWS.ID</code>.
	 */
	public void setId(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.VIEWS.ID</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<String, String, String, String, String, String, String, String, Integer> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<String, String, String, String, String, String, String, String, Integer> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Views.VIEWS.TABLE_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Views.VIEWS.TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Views.VIEWS.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Views.VIEWS.VIEW_DEFINITION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Views.VIEWS.CHECK_OPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Views.VIEWS.IS_UPDATABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Views.VIEWS.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return Views.VIEWS.REMARKS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return Views.VIEWS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getTableCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getTableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getViewDefinition();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getCheckOption();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getIsUpdatable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getRemarks();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ViewsRecord value1(String value) {
		setTableCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ViewsRecord value2(String value) {
		setTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ViewsRecord value3(String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ViewsRecord value4(String value) {
		setViewDefinition(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ViewsRecord value5(String value) {
		setCheckOption(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ViewsRecord value6(String value) {
		setIsUpdatable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ViewsRecord value7(String value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ViewsRecord value8(String value) {
		setRemarks(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ViewsRecord value9(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ViewsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, Integer value9) {
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
	 * Create a detached ViewsRecord
	 */
	public ViewsRecord() {
		super(Views.VIEWS);
	}

	/**
	 * Create a detached, initialised ViewsRecord
	 */
	public ViewsRecord(String tableCatalog, String tableSchema, String tableName, String viewDefinition, String checkOption, String isUpdatable, String status, String remarks, Integer id) {
		super(Views.VIEWS);

		setValue(0, tableCatalog);
		setValue(1, tableSchema);
		setValue(2, tableName);
		setValue(3, viewDefinition);
		setValue(4, checkOption);
		setValue(5, isUpdatable);
		setValue(6, status);
		setValue(7, remarks);
		setValue(8, id);
	}
}
