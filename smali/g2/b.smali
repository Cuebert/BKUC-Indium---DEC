.class public final synthetic Lg2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lg2/c;

.field public final synthetic o:La2/o;

.field public final synthetic p:Ly1/h;

.field public final synthetic q:La2/i;


# direct methods
.method public synthetic constructor <init>(Lg2/c;La2/o;Ly1/h;La2/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/b;->n:Lg2/c;

    iput-object p2, p0, Lg2/b;->o:La2/o;

    iput-object p3, p0, Lg2/b;->p:Ly1/h;

    iput-object p4, p0, Lg2/b;->q:La2/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lg2/b;->n:Lg2/c;

    iget-object v1, p0, Lg2/b;->o:La2/o;

    iget-object v2, p0, Lg2/b;->p:Ly1/h;

    iget-object v3, p0, Lg2/b;->q:La2/i;

    invoke-static {v0, v1, v2, v3}, Lg2/c;->b(Lg2/c;La2/o;Ly1/h;La2/i;)V

    return-void
.end method
