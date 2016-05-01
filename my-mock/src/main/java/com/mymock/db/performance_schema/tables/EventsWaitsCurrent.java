/**
 * This class is generated by jOOQ
 */
package com.mymock.db.performance_schema.tables;


import com.mymock.db.performance_schema.PerformanceSchema;
import com.mymock.db.performance_schema.enums.EventsWaitsCurrentNestingEventType;
import com.mymock.db.performance_schema.tables.records.EventsWaitsCurrentRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
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
public class EventsWaitsCurrent extends TableImpl<EventsWaitsCurrentRecord> {

	private static final long serialVersionUID = 226448218;

	/**
	 * The reference instance of <code>performance_schema.events_waits_current</code>
	 */
	public static final EventsWaitsCurrent EVENTS_WAITS_CURRENT = new EventsWaitsCurrent();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<EventsWaitsCurrentRecord> getRecordType() {
		return EventsWaitsCurrentRecord.class;
	}

	/**
	 * The column <code>performance_schema.events_waits_current.THREAD_ID</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_current.EVENT_ID</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, ULong> EVENT_ID = createField("EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_current.END_EVENT_ID</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, ULong> END_EVENT_ID = createField("END_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_waits_current.EVENT_NAME</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_current.SOURCE</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, String> SOURCE = createField("SOURCE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.events_waits_current.TIMER_START</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, ULong> TIMER_START = createField("TIMER_START", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_waits_current.TIMER_END</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, ULong> TIMER_END = createField("TIMER_END", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_waits_current.TIMER_WAIT</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, ULong> TIMER_WAIT = createField("TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_waits_current.SPINS</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, UInteger> SPINS = createField("SPINS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_waits_current.OBJECT_SCHEMA</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, String> OBJECT_SCHEMA = createField("OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.events_waits_current.OBJECT_NAME</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * The column <code>performance_schema.events_waits_current.INDEX_NAME</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, String> INDEX_NAME = createField("INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.events_waits_current.OBJECT_TYPE</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, String> OBJECT_TYPE = createField("OBJECT_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.events_waits_current.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_current.NESTING_EVENT_ID</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, ULong> NESTING_EVENT_ID = createField("NESTING_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_waits_current.NESTING_EVENT_TYPE</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, EventsWaitsCurrentNestingEventType> NESTING_EVENT_TYPE = createField("NESTING_EVENT_TYPE", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.mymock.db.performance_schema.enums.EventsWaitsCurrentNestingEventType.class), this, "");

	/**
	 * The column <code>performance_schema.events_waits_current.OPERATION</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, String> OPERATION = createField("OPERATION", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_waits_current.NUMBER_OF_BYTES</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, Long> NUMBER_OF_BYTES = createField("NUMBER_OF_BYTES", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>performance_schema.events_waits_current.FLAGS</code>.
	 */
	public final TableField<EventsWaitsCurrentRecord, UInteger> FLAGS = createField("FLAGS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

	/**
	 * Create a <code>performance_schema.events_waits_current</code> table reference
	 */
	public EventsWaitsCurrent() {
		this("events_waits_current", null);
	}

	/**
	 * Create an aliased <code>performance_schema.events_waits_current</code> table reference
	 */
	public EventsWaitsCurrent(String alias) {
		this(alias, EVENTS_WAITS_CURRENT);
	}

	private EventsWaitsCurrent(String alias, Table<EventsWaitsCurrentRecord> aliased) {
		this(alias, aliased, null);
	}

	private EventsWaitsCurrent(String alias, Table<EventsWaitsCurrentRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsWaitsCurrent as(String alias) {
		return new EventsWaitsCurrent(alias, this);
	}

	/**
	 * Rename this table
	 */
	public EventsWaitsCurrent rename(String name) {
		return new EventsWaitsCurrent(name, null);
	}
}
