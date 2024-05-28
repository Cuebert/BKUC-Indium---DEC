.class public abstract Lcom/android/billingclient/api/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/c$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static f(Landroid/content/Context;)Lcom/android/billingclient/api/c$a;
    .locals 2

    new-instance v0, Lcom/android/billingclient/api/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/android/billingclient/api/c$a;-><init>(Landroid/content/Context;Ln1/o0;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Ln1/a;Ln1/b;)V
.end method

.method public abstract b(Ln1/e;Ln1/f;)V
.end method

.method public abstract c(Ljava/lang/String;)Lcom/android/billingclient/api/f;
.end method

.method public abstract d()Z
.end method

.method public abstract e(Landroid/app/Activity;Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/f;
.end method

.method public abstract g(Lcom/android/billingclient/api/h;Ln1/g;)V
.end method

.method public abstract h(Ln1/k;Ln1/h;)V
.end method

.method public abstract i(Ln1/l;Ln1/i;)V
.end method

.method public abstract j(Ln1/d;)V
.end method
