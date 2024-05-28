.class public final Lkb/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Z

.field private static final b:Lkb/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "kotlinx.coroutines.main.delay"

    const/4 v1, 0x0

    .line 1
    invoke-static {v0, v1}, Lmb/b0;->f(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Lkb/b0;->a:Z

    .line 2
    invoke-static {}, Lkb/b0;->b()Lkb/c0;

    move-result-object v0

    sput-object v0, Lkb/b0;->b:Lkb/c0;

    return-void
.end method

.method public static final a()Lkb/c0;
    .locals 1

    sget-object v0, Lkb/b0;->b:Lkb/c0;

    return-object v0
.end method

.method private static final b()Lkb/c0;
    .locals 2

    .line 1
    sget-boolean v0, Lkb/b0;->a:Z

    if-nez v0, :cond_0

    sget-object v0, Lkb/a0;->v:Lkb/a0;

    return-object v0

    .line 2
    :cond_0
    invoke-static {}, Lkb/g0;->c()Lkb/d1;

    move-result-object v0

    .line 3
    invoke-static {v0}, Lmb/t;->c(Lkb/d1;)Z

    move-result v1

    if-nez v1, :cond_2

    instance-of v1, v0, Lkb/c0;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast v0, Lkb/c0;

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Lkb/a0;->v:Lkb/a0;

    :goto_1
    return-object v0
.end method
