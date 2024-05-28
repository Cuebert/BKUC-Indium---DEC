.class public final synthetic Lf7/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lf7/n;

.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(Lf7/n;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/m;->n:Lf7/n;

    iput p2, p0, Lf7/m;->o:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf7/m;->n:Lf7/n;

    iget v1, p0, Lf7/m;->o:I

    invoke-static {v0, v1}, Lf7/n;->s(Lf7/n;I)V

    return-void
.end method
