package cn.ac.lz233.tarnhelm.logic.dao

import cn.ac.lz233.tarnhelm.App

object SettingsDao {
    val workModeEditTextMenu
        get() = App.spSettings.getBoolean("workModeEditTextMenu", true)

    val workModeCopyMenu
        get() = App.spSettings.getBoolean("workModeCopyMenu", true)

    val workModeShare
        get() = App.spSettings.getBoolean("workModeShare", true)
}