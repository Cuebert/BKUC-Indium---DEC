.class final synthetic Lr5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final n:Lr5/p;

.field private final o:Lr5/i;


# direct methods
.method constructor <init>(Lr5/p;Lr5/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/d;->n:Lr5/p;

    iput-object p2, p0, Lr5/d;->o:Lr5/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr5/d;->n:Lr5/p;

    iget-object v1, p0, Lr5/d;->o:Lr5/i;

    .line 2
    iget v1, v1, Lr5/i;->a:I

    invoke-virtual {v0, v1}, Lr5/p;->b(I)V

    return-void
.end method
