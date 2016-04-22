/**
 * This class is generated by jOOQ
 */
package com.mymock.webproxy.db.information_schema.tables;


import com.mymock.webproxy.db.information_schema.InformationSchema;
import com.mymock.webproxy.db.information_schema.tables.records.TriggersRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class Triggers extends TableImpl<TriggersRecord> {

	private static final long serialVersionUID = -1456924765;

	/**
	 * The reference instance of <code>INFORMATION_SCHEMA.TRIGGERS</code>
	 */
	public static final Triggers TRIGGERS = new Triggers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TriggersRecord> getRecordType() {
		return TriggersRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_CATALOG</code>.
	 */
	public final TableField<TriggersRecord, String> TRIGGER_CATALOG = createField("TRIGGER_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_SCHEMA</code>.
	 */
	public final TableField<TriggersRecord, String> TRIGGER_SCHEMA = createField("TRIGGER_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_NAME</code>.
	 */
	public final TableField<TriggersRecord, String> TRIGGER_NAME = createField("TRIGGER_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_TYPE</code>.
	 */
	public final TableField<TriggersRecord, String> TRIGGER_TYPE = createField("TRIGGER_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.TABLE_CATALOG</code>.
	 */
	public final TableField<TriggersRecord, String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.TABLE_SCHEMA</code>.
	 */
	public final TableField<TriggersRecord, String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.TABLE_NAME</code>.
	 */
	public final TableField<TriggersRecord, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.BEFORE</code>.
	 */
	public final TableField<TriggersRecord, Boolean> BEFORE = createField("BEFORE", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.JAVA_CLASS</code>.
	 */
	public final TableField<TriggersRecord, String> JAVA_CLASS = createField("JAVA_CLASS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.QUEUE_SIZE</code>.
	 */
	public final TableField<TriggersRecord, Integer> QUEUE_SIZE = createField("QUEUE_SIZE", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.NO_WAIT</code>.
	 */
	public final TableField<TriggersRecord, Boolean> NO_WAIT = createField("NO_WAIT", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.REMARKS</code>.
	 */
	public final TableField<TriggersRecord, String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.SQL</code>.
	 */
	public final TableField<TriggersRecord, String> SQL = createField("SQL", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.ID</code>.
	 */
	public final TableField<TriggersRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.TRIGGERS</code> table reference
	 */
	public Triggers() {
		this("TRIGGERS", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.TRIGGERS</code> table reference
	 */
	public Triggers(String alias) {
		this(alias, TRIGGERS);
	}

	private Triggers(String alias, Table<TriggersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Triggers(String alias, Table<TriggersRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Triggers as(String alias) {
		return new Triggers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Triggers rename(String name) {
		return new Triggers(name, null);
	}
}
