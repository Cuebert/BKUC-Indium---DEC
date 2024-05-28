.class public Lx7/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx7/f$b;
    }
.end annotation


# static fields
.field public static a:Z

.field private static b:Lcom/birbit/android/jobqueue/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lx7/f;->b:Lcom/birbit/android/jobqueue/g;

    if-nez v0, :cond_2

    .line 2
    new-instance v0, Lq1/a$b;

    invoke-direct {v0, p0}, Lq1/a$b;-><init>(Landroid/content/Context;)V

    const/4 p0, 0x1

    .line 3
    invoke-virtual {v0, p0}, Lq1/a$b;->g(I)Lq1/a$b;

    move-result-object p0

    const/4 v0, 0x3

    .line 4
    invoke-virtual {p0, v0}, Lq1/a$b;->f(I)Lq1/a$b;

    move-result-object p0

    .line 5
    invoke-virtual {p0, v0}, Lq1/a$b;->e(I)Lq1/a$b;

    move-result-object p0

    const/16 v0, 0x78

    .line 6
    invoke-virtual {p0, v0}, Lq1/a$b;->b(I)Lq1/a$b;

    move-result-object p0

    .line 7
    sget-boolean v0, Lx7/f;->a:Z

    if-eqz v0, :cond_0

    .line 8
    new-instance v0, Lx7/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx7/f$b;-><init>(Lx7/f$a;)V

    invoke-virtual {p0, v0}, Lq1/a$b;->c(Lcom/birbit/android/jobqueue/log/CustomLogger;)Lq1/a$b;

    :cond_0
    if-eqz p1, :cond_1

    .line 9
    invoke-virtual {p0, p1}, Lq1/a$b;->d(Ljava/lang/String;)Lq1/a$b;

    .line 10
    :cond_1
    invoke-virtual {p0}, Lq1/a$b;->a()Lq1/a;

    move-result-object p0

    .line 11
    new-instance p1, Lcom/birbit/android/jobqueue/g;

    invoke-direct {p1, p0}, Lcom/birbit/android/jobqueue/g;-><init>(Lq1/a;)V

    sput-object p1, Lx7/f;->b:Lcom/birbit/android/jobqueue/g;

    :cond_2
    return-void
.end method

.method public static b()Lcom/birbit/android/jobqueue/g;
    .locals 1

    sget-object v0, Lx7/f;->b:Lcom/birbit/android/jobqueue/g;

    return-object v0
.end method
