/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.leanback.wistind.app.room.di.androidinject;

import androidx.leanback.wistind.app.room.controller.overview.LiveDataFragment;

import androidx.leanback.wistind.app.room.di.presenter.PresenterModule;
import androidx.leanback.wistind.app.room.di.scope.PerFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class LiveDataFragmentModule {

  @PerFragment
  @ContributesAndroidInjector(modules = {PresenterModule.class})
  abstract LiveDataFragment contributeLiveDataFragment();
}
