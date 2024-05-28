.class public Ls1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/birbit/android/jobqueue/log/CustomLogger;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Ls1/a;->a()V

    return-void
.end method

.method public static a()V
    .locals 1

    new-instance v0, Ls1/a$a;

    invoke-direct {v0}, Ls1/a$a;-><init>()V

    invoke-static {v0}, Ls1/a;->f(Lcom/birbit/android/jobqueue/log/CustomLogger;)V

    return-void
.end method

.method public static varargs b(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Ls1/a;->a:Lcom/birbit/android/jobqueue/log/CustomLogger;

    invoke-interface {v0, p0, p1}, Lcom/birbit/android/jobqueue/log/CustomLogger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static varargs c(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Ls1/a;->a:Lcom/birbit/android/jobqueue/log/CustomLogger;

    invoke-interface {v0, p0, p1}, Lcom/birbit/android/jobqueue/log/CustomLogger;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static varargs d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Ls1/a;->a:Lcom/birbit/android/jobqueue/log/CustomLogger;

    invoke-interface {v0, p0, p1, p2}, Lcom/birbit/android/jobqueue/log/CustomLogger;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static e()Z
    .locals 1

    sget-object v0, Ls1/a;->a:Lcom/birbit/android/jobqueue/log/CustomLogger;

    invoke-interface {v0}, Lcom/birbit/android/jobqueue/log/CustomLogger;->isDebugEnabled()Z

    move-result v0

    return v0
.end method

.method public static f(Lcom/birbit/android/jobqueue/log/CustomLogger;)V
    .locals 0

    sput-object p0, Ls1/a;->a:Lcom/birbit/android/jobqueue/log/CustomLogger;

    return-void
.end method
