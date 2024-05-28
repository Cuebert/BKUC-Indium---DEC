.class public final Lkb/e;
.super Lkb/k0;
.source "SourceFile"


# instance fields
.field private final v:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Ljava/lang/Thread;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkb/k0;-><init>()V

    .line 2
    iput-object p1, p0, Lkb/e;->v:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method protected v0()Ljava/lang/Thread;
    .locals 1

    iget-object v0, p0, Lkb/e;->v:Ljava/lang/Thread;

    return-object v0
.end method
