package com.iries.littlelemon.di

import android.content.Context
import androidx.room.Room
import com.iries.littlelemon.data.Database
import com.iries.littlelemon.data.MenuDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Provides
    fun provideMenuDao(menuDatabase: Database): MenuDao {
        return menuDatabase.menuDao
    }

    @Provides
    @Singleton
    fun provideMenuDatabase(@ApplicationContext context: Context): Database {
        return Room.databaseBuilder(
            context = context,
            Database::class.java,
            "USER_DATA.DB"
        )
            .fallbackToDestructiveMigration()
            .build()
    }
}