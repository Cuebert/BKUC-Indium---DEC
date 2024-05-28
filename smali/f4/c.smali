.class final Lf4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic n:Lf4/a;


# direct methods
.method constructor <init>(Lf4/a;)V
    .locals 0

    iput-object p1, p0, Lf4/c;->n:Lf4/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf4/c;->n:Lf4/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lf4/a;->g(Lf4/a;I)V

    return-void
.end method
