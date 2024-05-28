.class public final synthetic Lr7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic n:Lcom/roblox/client/landing/AboutActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/landing/AboutActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr7/a;->n:Lcom/roblox/client/landing/AboutActivity;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 1

    iget-object v0, p0, Lr7/a;->n:Lcom/roblox/client/landing/AboutActivity;

    invoke-static {v0, p1}, Lcom/roblox/client/landing/AboutActivity;->A1(Lcom/roblox/client/landing/AboutActivity;Landroid/view/View;)Z

    move-result p1

    return p1
.end method
