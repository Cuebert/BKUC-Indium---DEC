.class public Lj8/a;
.super Lj8/b;
.source "SourceFile"


# instance fields
.field private m:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;Z)V
    .locals 6

    const-string v5, "FAILURE_NOTIFICATION_ID"

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Lj8/b;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 2
    iput-boolean p5, p0, Lj8/a;->m:Z

    return-void
.end method


# virtual methods
.method public o()Z
    .locals 1

    iget-boolean v0, p0, Lj8/a;->m:Z

    return v0
.end method
