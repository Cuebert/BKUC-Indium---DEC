.class public final Lkb/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lmb/a0;

.field public static final b:Lmb/a0;

.field private static final c:Lmb/a0;

.field private static final d:Lmb/a0;

.field private static final e:Lmb/a0;

.field private static final f:Lkb/i0;

.field private static final g:Lkb/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lmb/a0;

    const-string v1, "COMPLETING_ALREADY"

    invoke-direct {v0, v1}, Lmb/a0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkb/c1;->a:Lmb/a0;

    .line 2
    new-instance v0, Lmb/a0;

    const-string v1, "COMPLETING_WAITING_CHILDREN"

    invoke-direct {v0, v1}, Lmb/a0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkb/c1;->b:Lmb/a0;

    .line 3
    new-instance v0, Lmb/a0;

    const-string v1, "COMPLETING_RETRY"

    invoke-direct {v0, v1}, Lmb/a0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkb/c1;->c:Lmb/a0;

    .line 4
    new-instance v0, Lmb/a0;

    const-string v1, "TOO_LATE_TO_CANCEL"

    invoke-direct {v0, v1}, Lmb/a0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkb/c1;->d:Lmb/a0;

    .line 5
    new-instance v0, Lmb/a0;

    const-string v1, "SEALED"

    invoke-direct {v0, v1}, Lmb/a0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkb/c1;->e:Lmb/a0;

    .line 6
    new-instance v0, Lkb/i0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkb/i0;-><init>(Z)V

    sput-object v0, Lkb/c1;->f:Lkb/i0;

    .line 7
    new-instance v0, Lkb/i0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkb/i0;-><init>(Z)V

    sput-object v0, Lkb/c1;->g:Lkb/i0;

    return-void
.end method

.method public static final synthetic a()Lmb/a0;
    .locals 1

    sget-object v0, Lkb/c1;->a:Lmb/a0;

    return-object v0
.end method

.method public static final synthetic b()Lmb/a0;
    .locals 1

    sget-object v0, Lkb/c1;->c:Lmb/a0;

    return-object v0
.end method

.method public static final synthetic c()Lkb/i0;
    .locals 1

    sget-object v0, Lkb/c1;->g:Lkb/i0;

    return-object v0
.end method

.method public static final synthetic d()Lmb/a0;
    .locals 1

    sget-object v0, Lkb/c1;->e:Lmb/a0;

    return-object v0
.end method

.method public static final synthetic e()Lmb/a0;
    .locals 1

    sget-object v0, Lkb/c1;->d:Lmb/a0;

    return-object v0
.end method

.method public static final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lkb/q0;

    if-eqz v0, :cond_0

    new-instance v0, Lkb/r0;

    check-cast p0, Lkb/q0;

    invoke-direct {v0, p0}, Lkb/r0;-><init>(Lkb/q0;)V

    move-object p0, v0

    :cond_0
    return-object p0
.end method
