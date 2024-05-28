.class public final synthetic Lf7/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic n:Lf7/n;


# direct methods
.method public synthetic constructor <init>(Lf7/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/i;->n:Lf7/n;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object v0, p0, Lf7/i;->n:Lf7/n;

    invoke-static {v0, p1, p2}, Lf7/n;->q(Lf7/n;Landroid/content/DialogInterface;I)V

    return-void
.end method
