.class Lf7/e$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf7/e;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf7/e;


# direct methods
.method constructor <init>(Lf7/e;)V
    .locals 0

    iput-object p1, p0, Lf7/e$a;->a:Lf7/e;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object p1, p0, Lf7/e$a;->a:Lf7/e;

    invoke-static {p1}, Lf7/e;->c(Lf7/e;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {}, Lf7/e;->e()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    .line 2
    iget-object p1, p0, Lf7/e$a;->a:Lf7/e;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lf7/e;->d(Lf7/e;J)J

    .line 3
    iget-object p1, p0, Lf7/e$a;->a:Lf7/e;

    invoke-static {p1, p2}, Lf7/e;->f(Lf7/e;Landroid/content/Intent;)V

    :cond_0
    return-void
.end method
