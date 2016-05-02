/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.information_schema.InformationSchema;
import org.jooq.example.gradle.db.information_schema.tables.records.EventsRecord;
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
public class Events extends TableImpl<EventsRecord> {

	private static final long serialVersionUID = 680225965;

	/**
	 * The reference instance of <code>information_schema.EVENTS</code>
	 */
	public static final Events EVENTS = new Events();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<EventsRecord> getRecordType() {
		return EventsRecord.class;
	}

	/**
	 * The column <code>information_schema.EVENTS.EVENT_CATALOG</code>.
	 */
	public final TableField<EventsRecord, String> EVENT_CATALOG = createField("EVENT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.EVENTS.EVENT_SCHEMA</code>.
	 */
	public final TableField<EventsRecord, String> EVENT_SCHEMA = createField("EVENT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.EVENTS.EVENT_NAME</code>.
	 */
	public final TableField<EventsRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.EVENTS.DEFINER</code>.
	 */
	public final TableField<EventsRecord, String> DEFINER = createField("DEFINER", org.jooq.impl.SQLDataType.VARCHAR.length(77).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.EVENTS.TIME_ZONE</code>.
	 */
	public final TableField<EventsRecord, String> TIME_ZONE = createField("TIME_ZONE", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.EVENTS.EVENT_BODY</code>.
	 */
	public final TableField<EventsRecord, String> EVENT_BODY = createField("EVENT_BODY", org.jooq.impl.SQLDataType.VARCHAR.length(8).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.EVENTS.EVENT_DEFINITION</code>.
	 */
	public final TableField<EventsRecord, String> EVENT_DEFINITION = createField("EVENT_DEFINITION", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>information_schema.EVENTS.EVENT_TYPE</code>.
	 */
	public final TableField<EventsRecord, String> EVENT_TYPE = createField("EVENT_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(9).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.EVENTS.EXECUTE_AT</code>.
	 */
	public final TableField<EventsRecord, Timestamp> EXECUTE_AT = createField("EXECUTE_AT", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.EVENTS.INTERVAL_VALUE</code>.
	 */
	public final TableField<EventsRecord, String> INTERVAL_VALUE = createField("INTERVAL_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

	/**
	 * The column <code>information_schema.EVENTS.INTERVAL_FIELD</code>.
	 */
	public final TableField<EventsRecord, String> INTERVAL_FIELD = createField("INTERVAL_FIELD", org.jooq.impl.SQLDataType.VARCHAR.length(18), this, "");

	/**
	 * The column <code>information_schema.EVENTS.SQL_MODE</code>.
	 */
	public final TableField<EventsRecord, String> SQL_MODE = createField("SQL_MODE", org.jooq.impl.SQLDataType.VARCHAR.length(8192).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.EVENTS.STARTS</code>.
	 */
	public final TableField<EventsRecord, Timestamp> STARTS = createField("STARTS", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.EVENTS.ENDS</code>.
	 */
	public final TableField<EventsRecord, Timestamp> ENDS = createField("ENDS", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.EVENTS.STATUS</code>.
	 */
	public final TableField<EventsRecord, String> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.VARCHAR.length(18).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.EVENTS.ON_COMPLETION</code>.
	 */
	public final TableField<EventsRecord, String> ON_COMPLETION = createField("ON_COMPLETION", org.jooq.impl.SQLDataType.VARCHAR.length(12).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.EVENTS.CREATED</code>.
	 */
	public final TableField<EventsRecord, Timestamp> CREATED = createField("CREATED", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.EVENTS.LAST_ALTERED</code>.
	 */
	public final TableField<EventsRecord, Timestamp> LAST_ALTERED = createField("LAST_ALTERED", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.EVENTS.LAST_EXECUTED</code>.
	 */
	public final TableField<EventsRecord, Timestamp> LAST_EXECUTED = createField("LAST_EXECUTED", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.EVENTS.EVENT_COMMENT</code>.
	 */
	public final TableField<EventsRecord, String> EVENT_COMMENT = createField("EVENT_COMMENT", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.EVENTS.ORIGINATOR</code>.
	 */
	public final TableField<EventsRecord, Long> ORIGINATOR = createField("ORIGINATOR", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.EVENTS.CHARACTER_SET_CLIENT</code>.
	 */
	public final TableField<EventsRecord, String> CHARACTER_SET_CLIENT = createField("CHARACTER_SET_CLIENT", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.EVENTS.COLLATION_CONNECTION</code>.
	 */
	public final TableField<EventsRecord, String> COLLATION_CONNECTION = createField("COLLATION_CONNECTION", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.EVENTS.DATABASE_COLLATION</code>.
	 */
	public final TableField<EventsRecord, String> DATABASE_COLLATION = createField("DATABASE_COLLATION", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.EVENTS</code> table reference
	 */
	public Events() {
		this("EVENTS", null);
	}

	/**
	 * Create an aliased <code>information_schema.EVENTS</code> table reference
	 */
	public Events(String alias) {
		this(alias, EVENTS);
	}

	private Events(String alias, Table<EventsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Events(String alias, Table<EventsRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Events as(String alias) {
		return new Events(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Events rename(String name) {
		return new Events(name, null);
	}
}