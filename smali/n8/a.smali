.class public abstract Ln8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field protected static a:Z = false

.field protected static b:J = -0x1L
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a()J
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-wide v0, Ln8/a;->b:J

    return-wide v0
.end method

.method public static b()Z
    .locals 1

    sget-boolean v0, Ln8/a;->a:Z

    return v0
.end method
