/**
 * This class is generated by jOOQ
 */
package com.mymock.webproxy.db.information_schema.tables.records;


import com.mymock.webproxy.db.information_schema.tables.Help;

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
public class HelpRecord extends TableRecordImpl<HelpRecord> implements Record5<Integer, String, String, String, String> {

	private static final long serialVersionUID = 899863024;

	/**
	 * Setter for <code>INFORMATION_SCHEMA.HELP.ID</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.HELP.ID</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.HELP.SECTION</code>.
	 */
	public void setSection(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.HELP.SECTION</code>.
	 */
	public String getSection() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.HELP.TOPIC</code>.
	 */
	public void setTopic(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.HELP.TOPIC</code>.
	 */
	public String getTopic() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.HELP.SYNTAX</code>.
	 */
	public void setSyntax(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.HELP.SYNTAX</code>.
	 */
	public String getSyntax() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.HELP.TEXT</code>.
	 */
	public void setText(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.HELP.TEXT</code>.
	 */
	public String getText() {
		return (String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, String, String, String, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, String, String, String, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Help.HELP.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Help.HELP.SECTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Help.HELP.TOPIC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Help.HELP.SYNTAX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Help.HELP.TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getSection();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTopic();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getSyntax();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpRecord value2(String value) {
		setSection(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpRecord value3(String value) {
		setTopic(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpRecord value4(String value) {
		setSyntax(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpRecord value5(String value) {
		setText(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HelpRecord values(Integer value1, String value2, String value3, String value4, String value5) {
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
	 * Create a detached HelpRecord
	 */
	public HelpRecord() {
		super(Help.HELP);
	}

	/**
	 * Create a detached, initialised HelpRecord
	 */
	public HelpRecord(Integer id, String section, String topic, String syntax, String text) {
		super(Help.HELP);

		setValue(0, id);
		setValue(1, section);
		setValue(2, topic);
		setValue(3, syntax);
		setValue(4, text);
	}
}
