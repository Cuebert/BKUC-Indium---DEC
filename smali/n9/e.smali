.class public Ln9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln9/e$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ln9/e;->a:Ljava/util/concurrent/Executor;

    .line 3
    iput-object p2, p0, Ln9/e;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Ln9/e;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public b()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Ln9/e;->a:Ljava/util/concurrent/Executor;

    return-object v0
.end method
