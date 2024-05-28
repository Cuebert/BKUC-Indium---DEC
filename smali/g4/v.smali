.class final Lg4/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/i0;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lg4/c;

.field private final c:Lg4/n0;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lg4/c;Lg4/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg4/v;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lg4/v;->b:Lg4/c;

    iput-object p3, p0, Lg4/v;->c:Lg4/n0;

    return-void
.end method

.method static bridge synthetic a(Lg4/v;)Lg4/c;
    .locals 0

    iget-object p0, p0, Lg4/v;->b:Lg4/c;

    return-object p0
.end method

.method static bridge synthetic c(Lg4/v;)Lg4/n0;
    .locals 0

    iget-object p0, p0, Lg4/v;->c:Lg4/n0;

    return-object p0
.end method


# virtual methods
.method public final b(Lg4/l;)V
    .locals 2

    iget-object v0, p0, Lg4/v;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lg4/u;

    invoke-direct {v1, p0, p1}, Lg4/u;-><init>(Lg4/v;Lg4/l;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
