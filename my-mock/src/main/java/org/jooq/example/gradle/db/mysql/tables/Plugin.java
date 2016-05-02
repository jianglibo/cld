/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.mysql.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.gradle.db.mysql.Keys;
import org.jooq.example.gradle.db.mysql.Mysql;
import org.jooq.example.gradle.db.mysql.tables.records.PluginRecord;
import org.jooq.impl.TableImpl;


/**
 * MySQL plugins
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Plugin extends TableImpl<PluginRecord> {

	private static final long serialVersionUID = -1673772179;

	/**
	 * The reference instance of <code>mysql.plugin</code>
	 */
	public static final Plugin PLUGIN = new Plugin();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PluginRecord> getRecordType() {
		return PluginRecord.class;
	}

	/**
	 * The column <code>mysql.plugin.name</code>.
	 */
	public final TableField<PluginRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.plugin.dl</code>.
	 */
	public final TableField<PluginRecord, String> DL = createField("dl", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>mysql.plugin</code> table reference
	 */
	public Plugin() {
		this("plugin", null);
	}

	/**
	 * Create an aliased <code>mysql.plugin</code> table reference
	 */
	public Plugin(String alias) {
		this(alias, PLUGIN);
	}

	private Plugin(String alias, Table<PluginRecord> aliased) {
		this(alias, aliased, null);
	}

	private Plugin(String alias, Table<PluginRecord> aliased, Field<?>[] parameters) {
		super(alias, Mysql.MYSQL, aliased, parameters, "MySQL plugins");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<PluginRecord> getPrimaryKey() {
		return Keys.KEY_PLUGIN_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<PluginRecord>> getKeys() {
		return Arrays.<UniqueKey<PluginRecord>>asList(Keys.KEY_PLUGIN_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Plugin as(String alias) {
		return new Plugin(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Plugin rename(String name) {
		return new Plugin(name, null);
	}
}