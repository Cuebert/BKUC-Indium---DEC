.class public abstract Lcom/google/android/gms/internal/measurement/n8;
.super Lcom/google/android/gms/internal/measurement/p8;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/v9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/measurement/n8<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/measurement/p8<",
        "TMessageType;TBuilderType;>;",
        "Lcom/google/android/gms/internal/measurement/v9;"
    }
.end annotation


# instance fields
.field protected final zza:Lcom/google/android/gms/internal/measurement/h8;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/p8;-><init>()V

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/h8;->a()Lcom/google/android/gms/internal/measurement/h8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/n8;->zza:Lcom/google/android/gms/internal/measurement/h8;

    return-void
.end method
