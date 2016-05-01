/**
 * This class is generated by jOOQ
 */
package com.mymock.db.performance_schema.tables;


import com.mymock.db.performance_schema.PerformanceSchema;
import com.mymock.db.performance_schema.enums.EventsStagesHistoryNestingEventType;
import com.mymock.db.performance_schema.tables.records.EventsStagesHistoryRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
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
public class EventsStagesHistory extends TableImpl<EventsStagesHistoryRecord> {

	private static final long serialVersionUID = -161400057;

	/**
	 * The reference instance of <code>performance_schema.events_stages_history</code>
	 */
	public static final EventsStagesHistory EVENTS_STAGES_HISTORY = new EventsStagesHistory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<EventsStagesHistoryRecord> getRecordType() {
		return EventsStagesHistoryRecord.class;
	}

	/**
	 * The column <code>performance_schema.events_stages_history.THREAD_ID</code>.
	 */
	public final TableField<EventsStagesHistoryRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_history.EVENT_ID</code>.
	 */
	public final TableField<EventsStagesHistoryRecord, ULong> EVENT_ID = createField("EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_history.END_EVENT_ID</code>.
	 */
	public final TableField<EventsStagesHistoryRecord, ULong> END_EVENT_ID = createField("END_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_stages_history.EVENT_NAME</code>.
	 */
	public final TableField<EventsStagesHistoryRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.events_stages_history.SOURCE</code>.
	 */
	public final TableField<EventsStagesHistoryRecord, String> SOURCE = createField("SOURCE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.events_stages_history.TIMER_START</code>.
	 */
	public final TableField<EventsStagesHistoryRecord, ULong> TIMER_START = createField("TIMER_START", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_stages_history.TIMER_END</code>.
	 */
	public final TableField<EventsStagesHistoryRecord, ULong> TIMER_END = createField("TIMER_END", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_stages_history.TIMER_WAIT</code>.
	 */
	public final TableField<EventsStagesHistoryRecord, ULong> TIMER_WAIT = createField("TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_stages_history.WORK_COMPLETED</code>.
	 */
	public final TableField<EventsStagesHistoryRecord, ULong> WORK_COMPLETED = createField("WORK_COMPLETED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_stages_history.WORK_ESTIMATED</code>.
	 */
	public final TableField<EventsStagesHistoryRecord, ULong> WORK_ESTIMATED = createField("WORK_ESTIMATED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_stages_history.NESTING_EVENT_ID</code>.
	 */
	public final TableField<EventsStagesHistoryRecord, ULong> NESTING_EVENT_ID = createField("NESTING_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>performance_schema.events_stages_history.NESTING_EVENT_TYPE</code>.
	 */
	public final TableField<EventsStagesHistoryRecord, EventsStagesHistoryNestingEventType> NESTING_EVENT_TYPE = createField("NESTING_EVENT_TYPE", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.mymock.db.performance_schema.enums.EventsStagesHistoryNestingEventType.class), this, "");

	/**
	 * Create a <code>performance_schema.events_stages_history</code> table reference
	 */
	public EventsStagesHistory() {
		this("events_stages_history", null);
	}

	/**
	 * Create an aliased <code>performance_schema.events_stages_history</code> table reference
	 */
	public EventsStagesHistory(String alias) {
		this(alias, EVENTS_STAGES_HISTORY);
	}

	private EventsStagesHistory(String alias, Table<EventsStagesHistoryRecord> aliased) {
		this(alias, aliased, null);
	}

	private EventsStagesHistory(String alias, Table<EventsStagesHistoryRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventsStagesHistory as(String alias) {
		return new EventsStagesHistory(alias, this);
	}

	/**
	 * Rename this table
	 */
	public EventsStagesHistory rename(String name) {
		return new EventsStagesHistory(name, null);
	}
}
