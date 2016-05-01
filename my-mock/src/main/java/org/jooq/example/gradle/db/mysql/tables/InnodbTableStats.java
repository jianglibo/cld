/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.mysql.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.gradle.db.mysql.Keys;
import org.jooq.example.gradle.db.mysql.Mysql;
import org.jooq.example.gradle.db.mysql.tables.records.InnodbTableStatsRecord;
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
public class InnodbTableStats extends TableImpl<InnodbTableStatsRecord> {

	private static final long serialVersionUID = -1938171126;

	/**
	 * The reference instance of <code>mysql.innodb_table_stats</code>
	 */
	public static final InnodbTableStats INNODB_TABLE_STATS = new InnodbTableStats();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<InnodbTableStatsRecord> getRecordType() {
		return InnodbTableStatsRecord.class;
	}

	/**
	 * The column <code>mysql.innodb_table_stats.database_name</code>.
	 */
	public final TableField<InnodbTableStatsRecord, String> DATABASE_NAME = createField("database_name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>mysql.innodb_table_stats.table_name</code>.
	 */
	public final TableField<InnodbTableStatsRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>mysql.innodb_table_stats.last_update</code>.
	 */
	public final TableField<InnodbTableStatsRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.innodb_table_stats.n_rows</code>.
	 */
	public final TableField<InnodbTableStatsRecord, ULong> N_ROWS = createField("n_rows", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.innodb_table_stats.clustered_index_size</code>.
	 */
	public final TableField<InnodbTableStatsRecord, ULong> CLUSTERED_INDEX_SIZE = createField("clustered_index_size", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.innodb_table_stats.sum_of_other_index_sizes</code>.
	 */
	public final TableField<InnodbTableStatsRecord, ULong> SUM_OF_OTHER_INDEX_SIZES = createField("sum_of_other_index_sizes", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>mysql.innodb_table_stats</code> table reference
	 */
	public InnodbTableStats() {
		this("innodb_table_stats", null);
	}

	/**
	 * Create an aliased <code>mysql.innodb_table_stats</code> table reference
	 */
	public InnodbTableStats(String alias) {
		this(alias, INNODB_TABLE_STATS);
	}

	private InnodbTableStats(String alias, Table<InnodbTableStatsRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbTableStats(String alias, Table<InnodbTableStatsRecord> aliased, Field<?>[] parameters) {
		super(alias, Mysql.MYSQL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<InnodbTableStatsRecord> getPrimaryKey() {
		return Keys.KEY_INNODB_TABLE_STATS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<InnodbTableStatsRecord>> getKeys() {
		return Arrays.<UniqueKey<InnodbTableStatsRecord>>asList(Keys.KEY_INNODB_TABLE_STATS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbTableStats as(String alias) {
		return new InnodbTableStats(alias, this);
	}

	/**
	 * Rename this table
	 */
	public InnodbTableStats rename(String name) {
		return new InnodbTableStats(name, null);
	}
}
