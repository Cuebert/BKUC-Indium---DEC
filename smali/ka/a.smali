.class public Lka/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lka/a$a;
    }
.end annotation


# static fields
.field private static b:Lka/a;


# instance fields
.field private a:Z


# direct methods
.method private constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lka/a;->a:Z

    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Lka/a;->b:Lka/a;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lka/a;

    instance-of p0, p0, Landroid/app/Activity;

    invoke-direct {v0, p0}, Lka/a;-><init>(Z)V

    sput-object v0, Lka/a;->b:Lka/a;

    :cond_0
    return-void
.end method

.method public static d()Lka/a;
    .locals 1

    sget-object v0, Lka/a;->b:Lka/a;

    return-object v0
.end method


# virtual methods
.method public a(Lka/a$a;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    sget-object v0, Lka/a$a;->n:Lka/a$a;

    if-ne p1, v0, :cond_2

    if-nez p2, :cond_1

    .line 2
    iget-boolean p1, p0, Lka/a;->a:Z

    if-nez p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object p1

    const-wide/16 v0, 0x1

    const-string p2, "cold_start"

    invoke-virtual {p1, p2, v0, v1}, Lma/a;->c(Ljava/lang/String;J)V

    goto :goto_1

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object p1

    const-string p2, "warm_start"

    invoke-virtual {p1, p2}, Lma/a;->b(Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public b(Lka/a$a;)V
    .locals 1

    invoke-static {}, Lma/a;->e()Lma/a;

    move-result-object p1

    const-string v0, "app_paused"

    invoke-virtual {p1, v0}, Lma/a;->b(Ljava/lang/String;)V

    return-void
.end method
