.class public final Lkb/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lmb/a0;

.field private static final b:Lmb/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lmb/a0;

    const-string v1, "REMOVED_TASK"

    invoke-direct {v0, v1}, Lmb/a0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkb/n0;->a:Lmb/a0;

    .line 2
    new-instance v0, Lmb/a0;

    const-string v1, "CLOSED_EMPTY"

    invoke-direct {v0, v1}, Lmb/a0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkb/n0;->b:Lmb/a0;

    return-void
.end method

.method public static final synthetic a()Lmb/a0;
    .locals 1

    sget-object v0, Lkb/n0;->b:Lmb/a0;

    return-object v0
.end method

.method public static final synthetic b()Lmb/a0;
    .locals 1

    sget-object v0, Lkb/n0;->a:Lmb/a0;

    return-object v0
.end method
