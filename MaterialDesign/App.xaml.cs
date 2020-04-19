﻿using MaterialDesign.Views;
using System;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace MaterialDesign
{
    public partial class App : Application
    {
        public App()
        {
            InitializeComponent();

            //MainPage = new MainPage();
            MainPage = new CustomNavigationPage(new MainPage());
        }

        protected override void OnStart()
        {
        }

        protected override void OnSleep()
        {
        }

        protected override void OnResume()
        {
        }
    }
}
