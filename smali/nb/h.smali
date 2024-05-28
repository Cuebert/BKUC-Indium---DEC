.class public abstract Lnb/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public n:J

.field public o:Lnb/i;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 4
    sget-object v0, Lnb/l;->g:Lnb/i;

    const-wide/16 v1, 0x0

    invoke-direct {p0, v1, v2, v0}, Lnb/h;-><init>(JLnb/i;)V

    return-void
.end method

.method public constructor <init>(JLnb/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lnb/h;->n:J

    .line 3
    iput-object p3, p0, Lnb/h;->o:Lnb/i;

    return-void
.end method
